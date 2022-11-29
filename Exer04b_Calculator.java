package Exer04_Selection;

import javax.swing.JOptionPane;

public class Exer04b_Calculator {
    public static void main(String[] args) {
        String a=JOptionPane.showInputDialog(null, "Enter first number: ", "Calculator", JOptionPane.PLAIN_MESSAGE);
        String b=JOptionPane.showInputDialog(null, "Enter second number: ", "Calculator", JOptionPane.PLAIN_MESSAGE);
        String ope=JOptionPane.showInputDialog(null, "Select and operation\n+\n-\n*\n/\n%", "Calculator", JOptionPane.PLAIN_MESSAGE);
        switch (ope) {
            case "+":
                    JOptionPane.showMessageDialog(null, Integer.parseInt(a) + "+" + Integer.parseInt(b) + "=" + (Integer.parseInt(a) + Integer.parseInt(b)));
                    break;
            case "-":
                    JOptionPane.showMessageDialog(null, Integer.parseInt(a) + "-" + Integer.parseInt(b) + "=" + (Integer.parseInt(a) - Integer.parseInt(b)));
                    break;
            case "*":
                    JOptionPane.showMessageDialog(null, Integer.parseInt(a) + "*" + Integer.parseInt(b) + "=" + Integer.parseInt(a) * Integer.parseInt(b));
                    break;
            case "/":
                    JOptionPane.showMessageDialog(null, Integer.parseInt(a) + "/" + Integer.parseInt(b) + "=" + Integer.parseInt(a) / Integer.parseInt(b));
                    break;
            case "%":
                    JOptionPane.showMessageDialog(null, Integer.parseInt(a) + "%" + Integer.parseInt(b) + "=" + Integer.parseInt(a) % Integer.parseInt(b));
                    break;
            default: JOptionPane.showMessageDialog(null, "Invalid Enter Operation...");
        }
        System.exit(0);
    }
}
