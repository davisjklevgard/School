package edu.cvtc.java;

import java.util.Scanner;

public class StringAnalyzer {

    public static void main(String[] args) {

        //Variables
        String input;
        char[] chars;
        int letters = 0, digits = 0, whitespaces = 0;


        //Creat a Scanner
        Scanner keyboard = new Scanner(System.in);


        //Get a String from user
        System.out.print("Enter a string: ");
        input = keyboard.nextLine();

        //Convert the string to a character array
        chars = input.toCharArray();

        //Analyze the array
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])){
                letters++;
            }else if (Character.isDigit(chars[i])){
                digits++;
            }else if (Character.isWhitespace(chars[i])){
                whitespaces++;
            }
        }

        //Display the results
        System.out.println("That String contains " + letters + " letters, " +
                digits + " digits, and " +
                whitespaces + " whitespaces.");

        //Close Scanner
        keyboard.close();

    }
}
