
package Exer06_Methods;

import javax.swing.JOptionPane; 

public class Exer06_Methods2 {
    public static void main(String[] args) {
    String pass = JOptionPane.showInputDialog("Please input the password: ");
    if ("hanzjay".equals(pass)){
        Password(); 
    } else{
        MaliAngPassword();
    }
    }

    private static void Password(){
            JOptionPane.showMessageDialog(null,"Welcome Hanz Jay");
        }
    public static void MaliAngPassword(){
    JOptionPane.showMessageDialog(null,"Password is wrong!");
    }
}


