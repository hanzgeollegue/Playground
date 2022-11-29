package Exer06_Methods;

import javax.swing.JOptionPane;

public class Exer06_Methods {

    public static void main(String[] args) {
        int input = Integer.parseInt(JOptionPane.showInputDialog("Select an operation"
                + "\n1. Story"
                + "\n2. Password"
                + "\n3. Calculator"
                + "\n4. Number Value Comparison"));
        switch (input) {
            case 1:
                JOptionPane.showMessageDialog(null, "You have reincarnated! As a returner you have the choice to start your life all over again."
                        + "\n-----------------------------------------------------------------------------------------------------------------------------"
                        + "\n                                                       Enjoy your life human.");
                Background();
                Privileges();
                break;
            case 2:
                String pass = JOptionPane.showInputDialog("Please input the password: ");
                if ("hanzjay".equals(pass)) {
                    Password();
                } else {
                    MaliAngPassword();
                }
                break;
            case 3: 
                Calculator(); 
                break; 
            case 4:    
                JOptionPane.showMessageDialog(null, GreaterNumber()); 
                
        }
    }

    private static void Background() {
        JOptionPane.showMessageDialog(null, "You are born into a middle class family");
        String name = JOptionPane.showInputDialog("Enter your name: (Normally your parents choose this but you are special, so you choose it.)");
        JOptionPane.showMessageDialog(null, "Welcome " + name + ". As a returner, you have been given special privillages. "
                + "\n                   Before you start your life, let's set you up.");

    }

    private static void Privileges() {
        int option;
        String[] options = {"Strength \u273a", "Speed \u270b", "Wisdom \u270c"};
        option = JOptionPane.showOptionDialog(null, "These are the buffs that you are able to choose from", "Make your choice", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        JOptionPane.showMessageDialog(null, "You chose " + options[option]);
        JOptionPane.showMessageDialog(null, "\nAs someone whose chosen " + options[option] + " .You are better than other humans in this aspect.");
        JOptionPane.showMessageDialog(null, "Congrats! You are all set up. Now go forth and live your life!");
    }

    private static void Password() {
        JOptionPane.showMessageDialog(null, "Welcome Hanz Jay");
    }

    public static void MaliAngPassword() {
        JOptionPane.showMessageDialog(null, "Password is wrong!");
    }
    public static void Calculator(){
         double x = Double.parseDouble((JOptionPane.showInputDialog("Please enter input 1 here: ") ));
        double y = Double.parseDouble((JOptionPane.showInputDialog("Please enter input 2 here: ") ));
        
        double result1, result2, result3, result4; 
        
        result1 = x + y; 
        result2 = x - y;  
        result3 = x * y; 
        result4 = x / y; 
        
        JOptionPane.showMessageDialog(null, "The sum of " + x + " and " + y + " is: " + result1
        + "\nThe difference of " + x + " and " + y + " is: " + result2
        + "\nThe product of " + x + " and " + y + " is: " + result3
        + "\nThe qoutient of " + x + " and " + y + " is: " + result4);
        
    }
    public static String GreaterNumber(){
        JOptionPane.showMessageDialog(null, "This program will compare two numbers");
        
       int x = Integer.parseInt(JOptionPane.showInputDialog("Enter first number: ")); 
       int y = Integer.parseInt(JOptionPane.showInputDialog("Enter second number: "));  
       
        if(x>y) 
        return "The first number is greater than the second number";
        else 
        return "The second number is greater than the first number"; 
        
    }            
    }


