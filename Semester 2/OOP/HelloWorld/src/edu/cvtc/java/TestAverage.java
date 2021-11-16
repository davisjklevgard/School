package edu.cvtc.java;

import java.util.Scanner;

public class TestAverage {

    public static void main(String[] args) {
        // Variables

        String input;
        double score1, score2, score3, average;
        char repeat;

        // Create Scanner
        Scanner keyboard = new Scanner(System.in);

        do {
            //Get test scores
            System.out.print("Enter score #1: ");
            score1 = keyboard.nextDouble();

            while (score1 <= 0) {
                System.out.println("The score must be positive.");
                System.out.print("Enter score #1: ");
                score1 = keyboard.nextDouble();
            }

            System.out.print("Enter score #2: ");
            score2 = keyboard.nextDouble();
            System.out.print("Enter score #3: ");
            score3 = keyboard.nextDouble();
            //Calculate and print average
            average = (score1 +score2 + score3) / 3;
            System.out.println("The average is " + average + "\n");

            // See if the user wants to go again
            System.out.println("Would you like to average another set?");
            System.out.print("Enter Y for yes or N for no: ");
            input = keyboard.next();
            repeat = input.charAt(0);

        } while (repeat == 'y' || repeat =='Y');
        //Close Scanner

    }
}
