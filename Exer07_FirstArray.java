package Exer07_Array;

import javax.swing.JOptionPane;

public class Exer07_FirstArray {

    public static void main(String[] args) {

        int[] array = new int[5];
        for (int j = 0; j < array.length; j++) {

            array[j] = Integer.parseInt(JOptionPane.showInputDialog("Input a number: "));

        }

        for (int i = 0; i < array.length; i++) {

            JOptionPane.showMessageDialog(null, "The inputed numbers are " + array[i]);

        }

    }
}
