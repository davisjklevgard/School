package edu.cvtc.java;

public class Rectangle {

    //Attributes
    private double width;
    private double length;

    // Default Constructor
    public Rectangle() {
        setWidth(0.0);
        setLength(0.0);
    }

    // Overload Constructor
    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    //Methods

    public void setWidth(double width) {
        if (width <= 0) {
            this.width = 0;
        }else {
            this.width = width;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        if (length <= 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
        return length * width;
    }

    //Multiple argument method
    public void set(double length, double width){
       //this.width = width;
        setWidth(width);
        //this.length = length;
        setLength(length);
    }
}
