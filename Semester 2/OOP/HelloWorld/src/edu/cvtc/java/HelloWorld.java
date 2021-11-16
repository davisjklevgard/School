package edu.cvtc.java;

public class HelloWorld {

    public static void main(String[] args) {

        String firstWord = "Hello";
        String toWhom = "Davis Klevgard";
        String message = showMessage(firstWord, toWhom, false);


        System.out.println(message);

    }

    private static String showMessage(String firstWord, String toWhom, boolean isPlain) {

        String endPoint;
        if (isPlain) {
            endPoint = ".";
        } else {
            endPoint = "!";
        }

        String message = firstWord + ", " + toWhom + endPoint;

        return message;
    }
}
