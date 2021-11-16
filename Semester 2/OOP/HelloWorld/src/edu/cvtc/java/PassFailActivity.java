package edu.cvtc.java;

public class PassFailActivity extends GradedActivity{

    //Attribute
    private double minimumPassingScore;

    //Overloaded Constructor
    public PassFailActivity(double minimumPassingScore){
        this.minimumPassingScore = minimumPassingScore;
    }

    @Override
    public char getGrade() {
        char letterGrade = ' ';

        if (super.getScore() >= minimumPassingScore){
            letterGrade = 'P';
        }else{
            letterGrade = 'F';
        }

        return letterGrade;
    }
}
