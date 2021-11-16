package edu.cvtc.java;

public abstract class Student {

    //
    private String name;
    private String idNumber;
    private int yearAdmitted;


    // Set all values
    public Student (String name, String idNumber, int yearAdmitted){
        this.name = name;
        this.idNumber = idNumber;
        this.yearAdmitted = yearAdmitted;
    }

    //Get all values

    @Override
    public String toString() {
        String retVal = "";



        retVal += "Name='" + name + "\n" + " idNumber='" + idNumber + "\n" + " yearAdmitted=" + yearAdmitted;


        return retVal;
    }


    //Abstract method
    public abstract int getRemainingCredits();


}
