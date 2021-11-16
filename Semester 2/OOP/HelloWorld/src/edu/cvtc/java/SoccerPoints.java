package edu.cvtc.java;
/*
  Author: Eric Wackwitz
*/

import java.util.Scanner;

public class SoccerPoints {

    public static void main(String[] args) {

        // Variables
        int points;
        int totalPoints = 0;

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Display general instructions.
        System.out.println("Enter the number of points your team");
        System.out.println("has earned for each game this season.");
        System.out.println("Enter -1 when finished.");
        System.out.println("");

        // Get the first number of points
        System.out.print("Enter game points or -1 to end: ");
        points = keyboard.nextInt();

        // Accumulate the points until -1 is entered.
        while (points != -1)
        {
            // Add points to totalPoints.
            totalPoints += points;

            // Get the next number of points.
            System.out.print("Enter game points or -1 to end: ");
            points = keyboard.nextInt();
        }

        // Display the total number of points.
        System.out.println("\nThe total points are " + totalPoints);

        // Close the keyboard object
        keyboard.close();

    }

}
