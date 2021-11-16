package edu.cvtc.java;

import java.util.Scanner;

public class MultipleArgs {
    public static void main(String[] args) {

        //Variables
        //one way
        //double length, width;
        double length;
        double width;
        double area; 

        //Create a Scanner Object for keyboard input
        Scanner keyboard = new Scanner(System.in);

        //Create new Rectangle Object
        Rectangle kitchen = new Rectangle();
        Rectangle bedroom = new Rectangle();
        Rectangle bathroom = new Rectangle();

        //Get dimensions of kitchen
        System.out.print("What is the length of the kitchen? ");
        length = keyboard.nextDouble();
        kitchen.setLength(length);

        System.out.print("What is the width of the kitchen? ");
        width = keyboard.nextDouble();
        kitchen.setWidth(width);

        // Get dimensions of bedroom
        System.out.print("\nWhat is the length of the bedroom? ");
        length = keyboard.nextDouble();
        bedroom.setLength(length);

        System.out.print("What is the width of the bedroom? ");
        width = keyboard.nextDouble();
        bedroom.setWidth(width);

        //Get dimensions of bathroom
        System.out.print("\nWhat is the length of the bathroom? ");
        length = keyboard.nextDouble();
        bathroom.setLength(length);

        System.out.print("What is the width of the bathroom? ");
        width = keyboard.nextDouble();
        bathroom.setWidth(width);


        //Display the length, width, and area to the user
        System.out.println("The length of the kitchen is: " + kitchen.getLength());
        System.out.println("The width of the kitchen is: " + kitchen.getWidth());
        System.out.println("The area of the kitchen is: " + kitchen.getArea());

        System.out.println("The length of the bedroom is: " + bedroom.getLength());
        System.out.println("The width of the bedroom is: " + bedroom.getWidth());
        System.out.println("The area of the bedroom is: " + bedroom.getArea());

        System.out.println("The length of the bathroom is: " + bathroom.getLength());
        System.out.println("The width of the bathroom is: " + bathroom.getWidth());
        System.out.println("The area of the bathroom is: " + bathroom.getArea());

        System.out.println("The total area of the three rooms is: " + (kitchen.getArea() + bathroom.getArea() + bedroom.getArea()));



        //Close the Scanner
        keyboard.close();
    }
}
