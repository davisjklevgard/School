package edu.cvtc.java;

public class MetricDemo {

    public static void main(String[] args) {

        double miles = 12.29;
        double kilometers = 19.77461;

        System.out.println("There are " + Metric.milesToKilometers(miles)
        + " kilometers in " + miles + ".");

        System.out.println("There are " + Metric.kilometersToMiles(kilometers)
                + " miles in " + kilometers + ".");
    }
}
