
package Exer04_Selection;

import javax.swing.JOptionPane;

public class Exer04c_GradeSystem {
        public static void main(String[] args) {

        double grade_one, grade_two, grade_three, grade_four, grade_five;
        String input, student_name;


        input = JOptionPane.showInputDialog(null, "Input the Student's name:", "Name",JOptionPane.PLAIN_MESSAGE);
        student_name = String.valueOf(input);

        input = JOptionPane.showInputDialog(null, "Input student's grade for course one:","Grade", JOptionPane.PLAIN_MESSAGE);
        grade_one = Double.parseDouble(input);

        input = JOptionPane.showInputDialog(null, "Input student's grade for course two:", "Grade", JOptionPane.PLAIN_MESSAGE);
        grade_two = Double.parseDouble(input);

        input = JOptionPane.showInputDialog(null, "Input student's grade for course three:", "Grade", JOptionPane.PLAIN_MESSAGE);
        grade_three = Double.parseDouble(input);

        input = JOptionPane.showInputDialog(null, "Input student's grade for course four:", "Grade", JOptionPane.PLAIN_MESSAGE);
        grade_four = Double.parseDouble(input);

        input = JOptionPane.showInputDialog(null, "Input student's grade for course five:", "Grade", JOptionPane.PLAIN_MESSAGE);
        grade_five = Double.parseDouble(input);


        double average;
        average = (grade_one + grade_two + grade_three + grade_four + grade_five)/5;

        if (average <= 0)
        {
            JOptionPane.showMessageDialog(null, "Average cannot be below zero","Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        if(average < 60)
            JOptionPane.showMessageDialog(null, student_name + " average is " + average + " \nStudent's grade is F");
        else if (average < 70)
            JOptionPane.showMessageDialog(null, student_name + " average is " + average + " \nStudent's grade is D");
        else if (average < 80)
            JOptionPane.showMessageDialog(null, student_name + " average is " + average + " \nStudent's grade is C");
        else if (average < 90)
            JOptionPane.showMessageDialog(null, student_name + " average is " + average + " \nStudent's grade is B");
        else if (average < 100)
            JOptionPane.showMessageDialog(null, student_name + "average is " + average + " \nStudent's grade is A");
        else if (average > 100)
            JOptionPane.showMessageDialog(null, "Average cannot be above 100" ,"Error", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }
}

