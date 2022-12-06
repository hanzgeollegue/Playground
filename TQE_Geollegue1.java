package TQE_Geollegue;

import javax.swing.JOptionPane;

public class TQE_Geollegue1 {

    static int[] array = new int[10];
    static String getOdd = "";
    static String getEven = "";
    static int sumOdd = 0;
    static int sumEven = 0;

    public static void main(String[] args) {
        Accept();
        getOdd();
        getEven(); 
        sumOdd();
        sumEven(); 
        if (sumOdd > sumEven){
            JOptionPane.showMessageDialog(null, "The sum of the Odd numbers is greater than the sum of the Even numbers"); 
        } else {
            JOptionPane.showMessageDialog(null, "The sum of the Even numbers is greater than the sum of the Odd numbers");
        }
        
    }
    
    public static void Accept() {

        for (int j = 0; j < array.length; j++) {

            array[j] = Integer.parseInt(JOptionPane.showInputDialog("Input a number: "));
        }

    }

    public static void getOdd() {
        
        String odd = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odd += "\n" + array[i];
                sumOdd += array[i];
            }JOptionPane.showMessageDialog(null, "Odd numbers in the given array are " + odd);
        }
        
    }
    public static void getEven() {
        String even = "";
        for (int k = 0; k < array.length; k++) {
            if (array[k] % 2 == 0) {
                even += "\n" + array[k];
                sumEven += array[k];
            } JOptionPane.showMessageDialog(null, "Even numbers in the given array are " + even);
        } 
    }
    public static void sumOdd(){  
        JOptionPane.showMessageDialog(null,"The odd numbers sum is: " + sumOdd );
}    

    public static void sumEven(){
        JOptionPane.showMessageDialog(null,"The even numbers sum is: " + sumEven );
    }
}


