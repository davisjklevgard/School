package edu.cvtc.java;

public class ObjectCopy {

    public static void main(String[] args) {

        Stock company1 = new Stock("ABC", 1.23);
        Stock company2;

        company2 = company1.copy();

        // Use the toString method to display the contents
        System.out.println("Company 1: \n" + company1.toString());
        System.out.println();
        System.out.println("Company 2: \n" + company2.toString());
        System.out.println();

        // Compare addresses to see if the objects are different
        if (company1 == company2) {
            System.out.println("Equal");
        } else {
            System.out.println("Different");
        }

    }

}