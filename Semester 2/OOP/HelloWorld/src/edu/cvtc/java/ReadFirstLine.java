package edu.cvtc.java;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFirstLine {

    public static void main(String[] args) throws IOException {

        // Variables
        String fileName;
        String line;

        // Create a Scanner
        Scanner keyboard = new Scanner(System.in);

        // Get the file name
        System.out.print("Enter the name of the file: ");
        fileName = keyboard.nextLine();

        // Open the file
        File file = new File(fileName);
        Scanner input = new Scanner(file);

        // Read the first line from the file
        line = input.nextLine();

        // Display the line
        System.out.println("The first line of the file is:");
        System.out.println(line);

        // Close the file
        input.close();
        // Close the scanner
        keyboard.close();

    }
}