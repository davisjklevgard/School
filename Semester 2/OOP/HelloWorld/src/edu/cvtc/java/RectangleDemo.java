package edu.cvtc.java;

public class RectangleDemo {

    public static void main(String[] args) {
        //Create an Instance (Object)
        Rectangle rectangle = new Rectangle();

        //Initialize the object with values
        rectangle.setWidth(10);
        rectangle.setLength(20);

        //Retrieve the values from the object
        System.out.println("Width = " + rectangle.getWidth());
        System.out.println("Length = " + rectangle.getLength());
        System.out.println("Area = " + (int)rectangle.getArea());

    }
}
