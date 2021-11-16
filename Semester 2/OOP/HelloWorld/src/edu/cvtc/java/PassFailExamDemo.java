package edu.cvtc.java;

public class PassFailExamDemo {

    public static void main(String[] args) {

        int numberOfQuestion = 10;
        int numberOfMissed = 3;
        double minimumPassingScore = 60.0;

        PassFailExam passFailExam = new PassFailExam(minimumPassingScore, numberOfQuestion, numberOfMissed);

        //Display
        System.out.println("Each question is worth: " + passFailExam.getPointsEach() + " points.");
        System.out.println("The exam score is: " + passFailExam.getScore() + ".");
        System.out.println("The exam grade is: " + passFailExam.getGrade() + ".");
    }
}
