/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numberz;

/**
 *
 * @author PC
 */
public class NewClass {
    public static void main(String[] args) {
        
         int maxNumber = 18; 
		 int previousNumber = 0;
		 int nextNumber = 1;
		 
	        System.out.println("Fibonacci Series of "+maxNumber+" numbers:");
 
	        for (int i = 1; i <= maxNumber; ++i)
	        {
	            System.out.print(previousNumber+" ");
	           
 
	      
	            int sum = previousNumber + nextNumber;
	            previousNumber = nextNumber;
	            nextNumber = sum;
	        }
                
	}
    }

