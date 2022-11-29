
package Exer04_Selection;

import java.util.Random;
import javax.swing.JOptionPane; 

public class Exer04a_DragonFight {
    public static void main(String[] args) {
        int intro = Integer.parseInt(JOptionPane.showInputDialog("You have met a Dragon! Select action:"
                + "\n1. Fight"
                + "\n2. Run")); 
        
        switch (intro) {
            case 1:
                JOptionPane.showMessageDialog(null, "Prepare for battle!");
                int action1 = Integer.parseInt(JOptionPane.showInputDialog("1. Use a sword"
                        + "\n2. Use a bow"));
                if (action1 == 1){
                    Random cubedice = new Random();
                    int number1 = cubedice.nextInt(1000);
                    JOptionPane.showMessageDialog(null, "You have dealt " + number1 + " damage." );
                    
                    if (number1 >= 800){
                        JOptionPane.showMessageDialog(null, "You hit a crit! You have slain the Dragon");
                    }else if (number1 <= 799){
                        int number2 = cubedice.nextInt(499);
                        JOptionPane.showMessageDialog(null, "The dragon is still alive. "
                                + "Press Enter to hit it again!" );
                        JOptionPane.showMessageDialog(null, "You have dealt " + number2 + " damage." );
                        JOptionPane.showMessageDialog(null, "You have slain the Dragon!");}
                }else if (action1 == 2 ){
                    Random cubedice2 = new Random();
                    
                    int number3 = cubedice2.nextInt(1000);
                    JOptionPane.showMessageDialog(null, "You have dealt " + number3 + " damage." );
                    
                    if (number3 >= 800){
                        JOptionPane.showMessageDialog(null, "You hit a crit! You have slain the Dragon");
                    }else if (number3 <= 799){
                        int number4 = cubedice2.nextInt(499);
                        JOptionPane.showMessageDialog(null, "The dragon is still alive. "
                                + "Press Enter to shoot it again!" );
                        JOptionPane.showMessageDialog(null, "You have dealt " + number4 + " damage." );
                        JOptionPane.showMessageDialog(null, "You have slain the Dragon!"); }}
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "You have been slain by the Dragon");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid action!");
                break;
        }
    }           
        } 
     
    