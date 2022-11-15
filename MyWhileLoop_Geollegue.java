
package Geollegue;

import javax.swing.JOptionPane; 

public class MyWhileLoop_Geollegue {
    public static void main(String[] args) {
        String numberSt; 
        double number, total = 0; 
        
        int i = 0; 
        final int N = 5; 
        
        while (i < N){
            numberSt = JOptionPane.showInputDialog("Enter a Number"); 
            number = Double.parseDouble(numberSt); 
            total += number; 
            i++;     
        } JOptionPane.showMessageDialog(null, "The total is " + total); 
        
        String numberSt1; 
        double number1, total1 = 0; 
        int i1 = 0; 
        final int SENTINEL = -999; 
        
        numberSt1 = JOptionPane.showInputDialog("Enter a number to add (-999 to quit): "); 
        number1 = Double.parseDouble(numberSt1); 
        
        while (number1 != SENTINEL)
        {
            total1 += number1; 
            numberSt1 = JOptionPane.showInputDialog("Enter a number to add (-999 to quit): "); 
            number1 = Double.parseDouble(numberSt1); 
        } JOptionPane.showMessageDialog(null, "The total is " + total1);
        
        System.exit(0);
    }
    
}
