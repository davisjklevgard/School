package edu.cvtc.java;

public class SubClass2 extends SuperClass2 {

    public void showValue(double arg) {
        System.out.println("SUBCLASS: The double argument was " + arg);
    }

    @Override
    public void showValue(int arg) {
        System.out.println("SUBCLASS: The int argument was " + arg);
    }

}

