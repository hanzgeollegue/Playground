
package TQE_Geollegue;

import javax.swing.JOptionPane; 

public class TQE_Geollegue {
    public static void main(String[] args) {
        
        int[] array = new int[10];
        for (int j = 0; j < array.length; j++) {

            array[j] = Integer.parseInt(JOptionPane.showInputDialog("Input a number: "));
    } String odd = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
             odd += array[i];
            }
        }
        JOptionPane.showMessageDialog(null, "Odd numbers in the given array are" + odd);
        
        
        String even = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even += "\n" + array[i];
            }
        }
        JOptionPane.showMessageDialog(null, "Even numbers in the given array are " + even);
        
        
        }
}
