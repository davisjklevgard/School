package edu.cvtc.java;
/*
  Author: Eric Wackwitz
*/

public class MyMath {

    // Create two methods that overload each other
    public static int square(int number) {
        System.out.println("This is the method with the 'int' signature.");
        return number * number;
    }

    public static double square(double number) {
        System.out.println("This is the method with the 'double' signature.");
        return number * number;
    }

}
