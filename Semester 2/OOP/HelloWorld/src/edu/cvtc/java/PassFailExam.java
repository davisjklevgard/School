package edu.cvtc.java;

public class PassFailExam extends PassFailActivity{

    //Attributes
    private int numberOfQuestions;
    private int numberOfMissed;
    private double pointsEach;


    //Overloaded Constructor
    public PassFailExam(double minimumPassingScore, int numberOfQuestions, int numberOfMissed){
        super(minimumPassingScore); //Calls Overloaded Constructor

        double numericScore;

        this.numberOfQuestions = numberOfQuestions;
        this.numberOfMissed = numberOfMissed;

        //Calculate points for each question
        pointsEach = 100.0 / numberOfQuestions;
        numericScore = 100.0 - (numberOfMissed * pointsEach);

        //Call superclass setScore method
        super.setScore(numericScore);
    }


    //Methods
    public int getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public int getNumberOfMissed() {
        return numberOfMissed;
    }

    public double getPointsEach() {
        return pointsEach;
    }
}
