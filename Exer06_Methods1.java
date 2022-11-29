
package Exer06_Methods;
 
import javax.swing.JOptionPane; 

public class Exer06_Methods1 {
    public static void main(String[] args) {
       JOptionPane.showMessageDialog(null, "You have reincarnated! As a returner you have the choice to start your life all over again."
               + "\n-----------------------------------------------------------------------------------------------------------------------------"
               + "\n                                                       Enjoy your life human."); 
       Background(); 
       Privileges(); 
    }
    private static void Background(){
        JOptionPane.showMessageDialog(null, "You are born into a middle class family");
        String name = JOptionPane.showInputDialog("Enter your name: (Normally your parents choose this but you are special, so you choose it.)"); 
        JOptionPane.showMessageDialog(null, "Welcome " + name + ". As a returner, you have been given special privillages. "
                + "\n                   Before you start your life, let's set you up."); 
    }
    private static void Privileges(){
        int option;
        String[] options = {"Strength \u273a", "Speed \u270b", "Wisdom \u270c"};
        option = JOptionPane.showOptionDialog(null, "These are the buffs that you are able to choose from", "Make your choice", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        JOptionPane.showMessageDialog(null, "You chose " + options[option]);
        JOptionPane.showMessageDialog(null, "\nAs someone whose chosen "+ options[option] + " .You are better than other humans in this aspect.");
        JOptionPane.showMessageDialog(null, "Congrats! You are all set up. Now go forth and live your life!");
        }
    }


