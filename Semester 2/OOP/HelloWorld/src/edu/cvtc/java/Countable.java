package edu.cvtc.java;

public class Countable {

    //Static instance variable
    private static int instanceCount = 0;

    //Default Constructor
    public Countable() {
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}
