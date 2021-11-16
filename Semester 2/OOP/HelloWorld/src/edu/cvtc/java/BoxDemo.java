package edu.cvtc.java;

public class BoxDemo {

    public static void main(String[] args) {

        double length = 10.0;
        double width = 10.0;
        double height = 10.0;

        Box myBox = new Box(length, width, height);

        System.out.println("Here are the properties of the box:");
        System.out.println("Length: " + myBox.getLength());
        System.out.println("Width: " + myBox.getWidth());
        System.out.println("Height: " + myBox.getHeight());
        System.out.println("Base Area: " + myBox.getArea());
        System.out.println("Surface Area: " + myBox.getSurfaceArea());
        System.out.println("Volume: " + myBox.getVolume());

    }

}


