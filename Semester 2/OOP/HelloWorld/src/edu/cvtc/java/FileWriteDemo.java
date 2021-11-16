package edu.cvtc.java;

import java.io.*;
import java.util.Scanner;

public class FileWriteDemo {

    public static void main(String[] args) throws FileNotFoundException {

        // Variables
        String fileName;
        String friendName;
        int numFriends;

        // Create a Scanner
        Scanner keyboard = new Scanner(System.in);

        // Get the number of friends
        System.out.print("How many friends do you have? ");
        numFriends = keyboard.nextInt();

        // Consume the newline character
        keyboard.nextLine();

        // Get the file name
        System.out.print("Enter the file name: ");
        fileName = keyboard.nextLine();

        // Open the file
        PrintWriter outputFile = new PrintWriter(fileName);

        // Get data and write to the file
        for (int i = 1; i <= numFriends; i++) {
            // Get the name of a friend
            System.out.print("Enter the name of friend #" + i + ": ");
            friendName = keyboard.nextLine();

            // Write the name to the file
            outputFile.println(friendName);
        }

        // Close the file
        outputFile.close();
        System.out.println("Data was written to the file.");

        // Close the keyboard
        keyboard.close();

    }
}
