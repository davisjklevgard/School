package edu.cvtc.java;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class CustomerNumber {

    public static void main(String[] args) {

        //Format of our customer number XXX9999
        String customerNumber;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a customer number in the format XXX9999.");
        System.out.print("(XXX = letter and 9999 = numbers): ");

        customerNumber = keyboard.nextLine();

        Customer customer = new Customer("Eric", customerNumber);

//        System.out.println("Name: " + customer.getName());
//        System.out.println("Number: " + customer.getNumber());

        System.out.println(customer.toString());


//        if (isValidNumber(customerNumber)) {
//            System.out.println("Valid");
//        } else {
//            System.out.println("Invalid");
//        }


        keyboard.close();
    }

    /*private static boolean isValidNumber(String customerNumber){
        //local variables
        boolean isValid = true;
        int index = 0;

        //Check #1: Is it 7 characters
        if (customerNumber.length() != 7){
            isValid = false;
        }

        //Check #2: Is bucket 0 a letter?
        //Check #3: Is bucket 1 a letter?
        //Check #4: Is bucket 2 a letter?
        //Check to see if it is valid first and then increment the loop
        while (isValid && index < 3) {
            if(!Character.isLetter(customerNumber.charAt(index))) {
                isValid = false;
            }
            index++;
        }

        //Check #5: Is bucket 3 a digit?
        //Check #6: Is bucket 4 a digit?
        //Check #7: Is bucket 5 a digit?
        //Check #8: Is bucket 6 a digit?
        while (isValid && index < 7) {
            if(!Character.isDigit(customerNumber.charAt(index))) {
                isValid = false;
            }
            index++;
        }


        return isValid;
    }*/
}
