package edu.cvtc.java;

public class Box extends Rectangle {

    // Attributes
    private double height;

    // Overloaded Constructor
    public Box(double length, double width, double height) {
        super(width, length);

        this.height = height;
    }

    // Methods
    public double getHeight() {
        return height;
    }

    public double getSurfaceArea() {
        return getArea() * 6;
    }

    public double getVolume() {
        return getArea() * getHeight();
    }

}

