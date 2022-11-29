
package Exer05_Repetition;
import javax.swing.*;
import java.util.*;

public class Exer05b_RockPaperScissors {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Each game is best of 3. \nLet's go and good luck! \n", "Welcome to Rock, Paper, Scissors!", JOptionPane.INFORMATION_MESSAGE);


        int option;
        int compOption;

        String[] outcome = {"You win, great job! ", "The computer wins ", "Draw! "};
        String result = "";


        String[] options = {"Rock \u273a", "Paper \u270b", "Scissors \u270c"};
        Random rand = new Random();
        int wins = 0;
        int losses = 0;
        int games = 0;

        do {
            int compWins = 0;
            int playerWins = 0;
            int ties = 0;
            do {
                option = JOptionPane.showOptionDialog(null, "Rock, Paper, Scissors", "Make your choice", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                compOption = rand.nextInt(3);
                switch (option) {
                    case 0:
                switch (compOption) {
                    case 0:
                        ties++;
                        result = outcome[2];
                        break;
                    case 1:
                        compWins++;
                        result = outcome[1];
                        break;
                    default:
                        playerWins++;
                        result = outcome[0];
                        break;
                }
                        break;
                    case 1:
                switch (compOption) {
                    case 0:
                        playerWins++;
                        result = outcome[0];
                        break;
                    case 1:
                        ties++;
                        result = outcome[2];
                        break;
                    default:
                        compWins++;
                        result = outcome[1];
                        break;
                }
                        break;
                    case 2:
                switch (compOption) {
                    case 0:
                        compWins++;
                        result = outcome[1];
                        break;
                    case 1:
                        playerWins++;
                        result = outcome[0];
                        break;
                    default:
                        ties++;
                        result = outcome[2];
                        break;
                }
                        break;
                }
                JOptionPane.showMessageDialog(null, "You chose " + options[option] + "\n" + "Computer chose " + options[compOption] + "\n"
                        + "Player Score: " + playerWins + "\nComputer Score: " + compWins + "\nDraws: " + ties);
            }
            while (compWins < 2 && playerWins < 2);
            games++;
            if (playerWins == 2) {
                wins++;
            } else {
                losses++;
            }
        }
        while (JOptionPane.showConfirmDialog(null, result + "Do you want to play again?", "Make your choice", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION);
        JOptionPane.showMessageDialog(null, "\nThanks for playing with me! Final outcome: \nGames played: " + games + "\nPlayer wins: " + wins + "\nPlayer losses: " + losses);
    }
    }