/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial1;

/**
 *
 * @author BHASKAR CHAUDHURY
 * 1) Make the instance variables private so that they cannot be accessed 
 * directly from outside the class. You can only set and get values of these 
 * variables through the methods of the class.
 * 2) Have getter and setter methods in the class to set and get the values 
 * of the fields
 *  
 */
public class Encapsulation { 
    public static void main(String args[]){
         EncapsulationDemo obj = new EncapsulationDemo();
         obj.setStuName("Rakesh");
         obj.setStuID(11);
         obj.setStuClass(10);
         System.out.println("Employee Name: " + obj.getStuName());
         System.out.println("Employee SSN: " + obj.getStuID());
         System.out.println("Employee Age: " + obj.getStuClass());
    } 
    
}

// Base class
class EncapsulationDemo{
    private int studentID;
    private String studentName;
    private int studentClass;

    //Getter and Setter methods
    public int getStuID(){
        return studentID;
    }

    public String getStuName(){
        return studentName;
    }

    public int getStuClass(){
        return studentClass;
    }

    public void setStuID(int newValue){
        studentID = newValue;
    }

    public void setStuName(String newValue){
        studentName = newValue;
    }

    public void setStuClass(int newValue){
        studentClass = newValue;
    }
}