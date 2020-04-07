/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial1;

/**
 *
 * @author BHASKAR CHAUDHURY | 07APR2020
 * Array can contains primitives data types as well as objects of a class 
 * depending on the definition of array. In case of primitives data types, 
 * the actual values are stored in contiguous memory locations. In case of 
 * objects of a class, the actual objects are stored in heap segment.
 * 
 */

// One-dimensional Array
public class OneDArrayExample {
    
    public static void main (String[] args)
    {          
      // declares an Array of integers. 
      int[] arr; 
          
      // allocating memory for 5 integers. 
      arr = new int[5]; 
          
      // initialize the first elements of the array 
      arr[0] = 10; 
          
      // initialize the second elements of the array 
      arr[1] = 20; 
          
      //so on... 
      arr[2] = 30; 
      arr[3] = 40; 
      arr[4] = 50; 
          
      // accessing the elements of the specified array 
      for (int i = 0; i < arr.length; i++) 
         System.out.println("Element at index " + i +  
                                      " : "+ arr[i]);           
    }
    
}
