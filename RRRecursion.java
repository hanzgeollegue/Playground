package Aight;

import java.util.Scanner;

public class RRRecursion {
    public static void main(String[] args) {

        ///This program asks for user input then finds the base raised to a given power

        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int base = input1.nextInt();

        System.out.print("Enter exponent number: ");
        int exponent = input1.nextInt();

        System.out.print("Result: ");
        System.out.print(power(base, exponent));

    }

    private static int power(int base, int exponent) {
        if (exponent < 1) {
            return 1; //base case
        }
        return base * power(base, exponent - 1); //recursive case

         }

    }

