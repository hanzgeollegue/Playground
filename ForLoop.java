
package Geollegue;
import javax.swing.JOptionPane; 

public class ForLoop {
    public static void main(String[] args) {
        String numberSt; 
        double number, total = 0; 
        final int N = 5; 
        
        for (int i = 0; i < N; i++) {
        
        numberSt = JOptionPane.showInputDialog("Enter a number: "); 
        number = Double.parseDouble(numberSt); 
        total += number; 
        }JOptionPane.showMessageDialog(null, "The total is " + total);
    }
}
