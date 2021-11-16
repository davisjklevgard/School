package edu.cvtc.java;

public class GradedActivity {

    // Attributes
    private double score;

    // Methods
    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public char getGrade() {
        char letterGrade = ' ';

        if (getScore() >= 90) {
            letterGrade = 'A';
        } else if (getScore() >= 80) {
            letterGrade = 'B';
        } else if (getScore() >= 70) {
            letterGrade = 'C';
        } else if (getScore() >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }

        return letterGrade;
    }
}

