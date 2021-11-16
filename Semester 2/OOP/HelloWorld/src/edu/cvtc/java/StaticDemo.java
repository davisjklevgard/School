package edu.cvtc.java;

public class StaticDemo {
    public static void main(String[] args) {
        Countable obj1 = new Countable();
        Countable obj2 = new Countable();
        // Countable obj3 = new Countable();
      //  Countable obj4 = new Countable();
        Countable obj5 = new Countable();
        Countable obj6 = new Countable();
        Countable obj7 = new Countable();
        Countable obj8 = new Countable();
        Countable obj9 = new Countable();

        int objectCounter = obj5.getInstanceCount();

        System.out.println("Object count: " + objectCounter);

    }
}
