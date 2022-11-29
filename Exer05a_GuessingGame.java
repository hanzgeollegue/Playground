package Exer05_Repetition;

import javax.swing.*;

public class Exer05a_GuessingGame {
    public static void main(String[] args) {
     int compNumber = (int) (Math.random() * 100 + 1);
        int hanzAnswer = 0;
        System.out.println("The correct guess would be " + compNumber);
        int count = 1;

        while (hanzAnswer != compNumber) {

            String feedback = JOptionPane.showInputDialog(null,
                    "Enter a number between 1 and 100", "Guessing Game", JOptionPane.QUESTION_MESSAGE);
            hanzAnswer = Integer.parseInt(feedback);

            JOptionPane.showMessageDialog(null, "" + determineGuess(hanzAnswer, compNumber, count));
            count++;
        }
    }


    public static String determineGuess(int hanzAnswer, int computerNumber, int count) {

        if (hanzAnswer <= 0 || hanzAnswer > 100) {
            return "Your guess is invalid";
        } else if (hanzAnswer == computerNumber) {
            return "Correct!\nTotal Guesses: " + count;
        } else if (hanzAnswer > computerNumber) {
            return "Your guess is too high, try again.\nTry Number: " + count;
        } else return "Your guess is too low, try again.\nTry Number: " + count;
    }
}