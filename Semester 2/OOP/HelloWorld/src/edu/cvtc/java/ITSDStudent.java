package edu.cvtc.java;

public class ITSDStudent extends Student{

    //Constants for Credits
    private final int MATH_CREDITS = 20;
    private final int GEN_ED_CREDITS = 40;
    private final int ITSD_Credits = 60;


    private int mathCredits;
    private int genEdCredits;
    private int itsdCredits;

    public ITSDStudent(String name, String idNumber, int yearAdmitted){
        super(name, idNumber, yearAdmitted);
    }



    public void setMathCredits(int mathCredits) {
        this.mathCredits = mathCredits;
    }



    public void setGenEdCredits(int genEdCredits) {
        this.genEdCredits = genEdCredits;
    }



    public void setItsdCredits(int itsdCredits) {
        this.itsdCredits = itsdCredits;
    }

    @Override
    public String toString() {
        String retVal = "";

        retVal += super.toString();
        retVal += "Major: IT Software Development \n";
        retVal += "Math Credits taken: " + mathCredits + "\n";
        retVal += "Gen Ed Credits taken: " + genEdCredits + "\n";
        retVal += "ITSD Credits taken: " + itsdCredits + "\n";



        return retVal;
    }

    @Override
    public int getRemainingCredits() {
        int requiredCredits = (MATH_CREDITS + GEN_ED_CREDITS + ITSD_Credits);
        int remainingCredits = requiredCredits - (mathCredits + genEdCredits + itsdCredits);
        return remainingCredits;
    }
}
