/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial1;

/**
 *
 * @author BHASKAR
 * 
 * Data Abstraction is the property by virtue of which only the essential 
 * details are displayed to the user.The trivial or the non-essentials units 
 * are not displayed to the user.
 * 
 * Consider a classic “shape” example, perhaps used in a computer-aided design 
 * system or game simulation. The base type is “shape” and each shape has a 
 * color, size and so on. From this, specific types of shapes are derived
 * (inherited)- circle, square, triangle and so on – each of which may have 
 * additional characteristics and behaviors. For example, certain shapes 
 * can be flipped. Some behaviors may be different, such as when you want to 
 * calculate the area of a shape. The type hierarchy embodies both the 
 * similarities and differences between the shapes.
 */
public class Abstraction {
    
    public static void main(String[] args) 
    { 
        Shape s1 = new Circle("Red", 2.2); 
        Shape s2 = new Rectangle("Yellow", 2, 4); 
          
        System.out.println(s1.toString()); 
        System.out.println(s2.toString()); 
    }
    
}

// Java program to illustrate the 
// concept of Abstraction
// Abstract class Shape  
abstract class Shape  
{ 
    String color; 
      
    // these are abstract methods 
    abstract double area(); 
    public abstract String toString(); 
      
    // abstract class can have constructor 
    public Shape(String color) { 
        System.out.println("Shape constructor called"); 
        this.color = color; 
    } 
      
    // this is a concrete method 
    public String getColor() { 
        return color; 
    } 
} 

// Concrete class Circle extends Shape
class Circle extends Shape 
{ 
    double radius; 
      
    public Circle(String color,double radius) { 
  
        // calling Shape constructor 
        super(color); 
        System.out.println("Circle constructor called"); 
        this.radius = radius; 
    } 
  
    @Override
    double area() { 
        return Math.PI * Math.pow(radius, 2); 
    } 
  
    @Override
    public String toString() { 
        return "Circle color is " + super.color +  
                       "and area is : " + area(); 
    } 
      
} 

// Concrete class Rectangle extends Shape
class Rectangle extends Shape{ 
  
    double length; 
    double width; 
      
    public Rectangle(String color,double length,double width) { 
        // calling Shape constructor 
        super(color); 
        System.out.println("Rectangle constructor called"); 
        this.length = length; 
        this.width = width; 
    } 
      
    @Override
    double area() { 
        return length*width; 
    } 
  
    @Override
    public String toString() { 
        return "Rectangle color is " + super.color +  
                           "and area is : " + area(); 
    } 
  
}