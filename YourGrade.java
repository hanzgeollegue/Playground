
package Exer003;

import javax.swing.JOptionPane; 

public class YourGrade {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Greetings Student, input your grade");
        int grade = Integer.parseInt(input);
        
        if (grade >= 95){
          JOptionPane.showMessageDialog(null, "your evaluation is A+");}
         else if (grade <= 94 && grade >= 90){
             JOptionPane.showMessageDialog(null, "your evaluation is A-");}
        if (grade <= 89 && grade >= 85){
            JOptionPane.showMessageDialog(null, "your evaluation is B+");}
        else if (grade <= 84 && grade >= 80){
            JOptionPane.showMessageDialog(null, "your evaluation is B");}
        if (grade <= 79 && grade >= 76){
            JOptionPane.showMessageDialog(null, "your evaluation is B- ");}
        else if (grade <= 75){
             JOptionPane.showMessageDialog(null, "your evaluation is C");}
        if (grade <= 74){
            JOptionPane.showMessageDialog(null, "you have failed this subject");
        }
         }
        }
        
        
        
       
   

