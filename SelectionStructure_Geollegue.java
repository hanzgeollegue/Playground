package Exer00_HelloWorld;

import javax.swing.JOptionPane; 

public class SelectionStructure_Geollegue {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "how old are you?");
        int age = Integer.parseInt(input); 
        
      // if (age >= 18){
     //       JOptionPane.showMessageDialog(null, "You are of legal age!");
     //   } else {
            
      //  JOptionPane.showMessageDialog(null, "You're underage, you need parental consent");
      //  }
      
      if (age >= 0 && age <= 2){
          JOptionPane.showMessageDialog(null, "In the infant stage"); 
           } else if (age >= 3 && age <= 12)
     JOptionPane.showMessageDialog(null, "In the childhood stage"); 
      if (age >= 13 && age <= 17)
        JOptionPane.showMessageDialog(null, "In the teens stage");
       else if (age >= 18 && age <= 21)
          JOptionPane.showMessageDialog(null,"In the young adult stage");
       if (age >= 21)
          JOptionPane.showMessageDialog(null, "You are an adult");
             
    }
        }


        
 