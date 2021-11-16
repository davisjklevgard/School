package edu.cvtc.java;

public class StockCompare {

    public static void main(String[] args) {

        Stock company1 = new Stock("ABC", 1.23);
        Stock company2 = new Stock("ABM", 1.23);

        if (company1.equals(company2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

    }

}

