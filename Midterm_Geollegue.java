package Midterm_Geollegue;
import javax.swing.JOptionPane; 

public class Midterm_Geollegue {
    public static void main (String[]args){
        String hanz; 
        int operation;
        operation = Integer.parseInt(JOptionPane.showInputDialog("Hanz Jay's Menu \n"
                + "---------------------------------------- \n"
                + "1. Do Math \n"
                + "2. Do Sales \n"
                + "3. Compute Grades"));  
        
        if (operation == 1){
            double x, y;
            x = Double.parseDouble(JOptionPane.showInputDialog("input first number"));
            y = Double.parseDouble(JOptionPane.showInputDialog("input second number"));
            double sum = x+y, diff = x-y, prod = x*y, quot = x/y; 
            JOptionPane.showMessageDialog(null, "the sum of the first number and second number is " + sum 
            + "\nthe difference of the first number and  second number is " + diff
            + "\nthe product of the first number and second number is " + prod
            + "\nthe quotient of the first number and second number is " + quot);
            
           }  if (operation == 2) {
               double cashgiven1,prodquant,cashgiven2, cashgiven3,cost1,cost2,cost3, res11,res22,res33; 
                int prodpicked,prod1,prod2,prod3; 
                prod1 = 20; 
                prod2 = 10; 
                prod3 = 15; 
               
            JOptionPane.showMessageDialog(null, "Vanilla Ice Cream @ PHP 20 "
                    + "\nChocolate Ice Cream @ PHP 10"
                    + "\nCookies and Cream @ 15");
            prodpicked = Integer.parseInt(JOptionPane.showInputDialog("Select an Ice Cream"
                    + "\n1. Vanilla"
                    + "\n2. Choco"
                    + "\n3. CnC"));
            prodquant = Integer.parseInt(JOptionPane.showInputDialog("Input Quantity"));
            
            if (prodpicked == 1){
                cost1 = prod1 * prodquant;
                JOptionPane.showMessageDialog(null, "Total Cost is " + cost1);
                cashgiven1 = Double.parseDouble(JOptionPane.showInputDialog("Please input amount of cash"));
                if (cashgiven1 < cost1){
                    JOptionPane.showMessageDialog(null, "Insufficient Cash");}
                    else if (cashgiven1 >= cost1){
                       res11 = cashgiven1 - cost1; 
                       JOptionPane.showMessageDialog(null, "change is " + res11);}}
                    
            else if(prodpicked == 2){
                cost2 = prod2 * prodquant;
                JOptionPane.showMessageDialog(null, "Total Cost is " + cost2);
                cashgiven2 = Double.parseDouble(JOptionPane.showInputDialog("Please input amount of cash"));
                if (cashgiven2 < cost2){
                    JOptionPane.showMessageDialog(null, "Insufficient Cash");}
                    else if (cashgiven2 >= cost2){
                       res22 = cashgiven2 - cost2; 
                       JOptionPane.showMessageDialog(null, "change is " + res22);}}
             else if(prodpicked == 3){
                cost3 = prod3 * prodquant;
                JOptionPane.showMessageDialog(null, "Total Cost is " + cost3);
                cashgiven3 = Double.parseDouble(JOptionPane.showInputDialog("Please input amount of cash"));
                if (cashgiven3 < cost3){
                    JOptionPane.showMessageDialog(null, "Insufficient Cash");}
                    else if (cashgiven3 >= cost3){
                       res33 = cashgiven3 - cost3; 
                       JOptionPane.showMessageDialog(null, "change is " + res33);}}
                
             }  if (operation == 3){
                 
                 int grade = Integer.parseInt(JOptionPane.showInputDialog("please input your grade"));
                 
                 if (grade >= 95 && grade <=100)
                     JOptionPane.showMessageDialog(null, "your evaluation is A");
                 else if (grade >= 90 && grade <=94)
                     JOptionPane.showMessageDialog(null, "your evalauation is A-");
                 else if (grade >= 85 && grade <=89)
                     JOptionPane.showMessageDialog(null, "your evaluation is B+");
                 else if (grade >= 80 && grade <= 84)
                     JOptionPane.showMessageDialog(null, "your evaluation is B");
                 else if (grade >= 75 && grade <= 79)
                     JOptionPane.showMessageDialog(null, "your evaluation is B-");
                 else if (grade < 75)
                     JOptionPane.showMessageDialog(null, "your evaluation is C");}
          
            }
                
    }  
            
            
            
              
              
        
        
    
            
    

