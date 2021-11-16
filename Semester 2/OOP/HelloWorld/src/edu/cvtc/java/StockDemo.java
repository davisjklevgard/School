package edu.cvtc.java;

public class StockDemo {

    public static void main(String[] args) {

        Stock xyzCompany = new Stock("XYZ", 10.36);

        // Display the values - Explicit call (Absolute Path)
        System.out.println(xyzCompany.toString());

//    // Implicit call (Relative Path)
//    System.out.println(xyzCompany);

    }

}
