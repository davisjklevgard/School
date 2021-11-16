package edu.cvtc.java;

import java.util.Scanner;

public class CharacterTest {

    public static void main(String[] args) {

        //Variables
        String inputLine;
        char inputChar;

        // Create a Scanner
        Scanner keyboard = new Scanner(System.in);

        //Get character from the User
        System.out.print("Please enter a character: ");
        inputLine = keyboard.nextLine();
        inputChar = inputLine.charAt(0);

        //Use the Character Wrapper class to test
        if (Character.isLetter(inputChar)){
            System.out.println("Letter");
        }

        if (Character.isDigit(inputChar)) {
            System.out.println("Number");
        }

        if (Character.isUpperCase(inputChar)){
            System.out.println("Uppercase Letter");
        }

        if (Character.isLowerCase(inputChar)){
            System.out.println("Lowercase Letter");
        }

        if (inputChar == '&' || inputChar =='!' || inputChar == '$') {
            System.out.println("Special Character");
        }




        //Close Scanner
        keyboard.close();
    }


}
