
package Exer05_Repetition;

import javax.swing.JOptionPane;

public class Exer05c_SalaryPerCommision {
    public static void main(String[] args) {
        double sales , salary, totalSalary = 0;
        while (true) {
            try {
                sales = Double.parseDouble(JOptionPane.showInputDialog("ENTER SALES IN DOLLAR (-1 TO END):  "));
                if (sales == -1) break;
                salary = 200 + sales * 0.01;
                JOptionPane.showMessageDialog(null,"SALARY: $ " + salary);
                totalSalary += salary;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"NumberFormatException");
            }
        }
       JOptionPane.showMessageDialog(null, "THE TOTAL SALARY FOR THE WEEK:  $" + totalSalary + "\n" +
                " GOOD DAY!  THANK YOU FOR USING THE SYSTEM!");
        }
    }

