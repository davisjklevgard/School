package edu.cvtc.java;

import java.util.concurrent.ForkJoinPool;

public class Polymorphic {

    public static void main(String[] args) {
        // Create an array of Graded Activity objects
        GradedActivity[] tests = new GradedActivity[3];

        //Set the GA items to existing objects
        //First will be a graded activity
        //Second will be a PassFailExam
        //Third will be a FinalExam
        tests[0] = new GradedActivity();
        tests[0].setScore(95);

        tests[1] = new PassFailExam(60, 20, 5);

        tests[2] = new FinalExam(50, 7);

        //Once we have set the items. we will loop through the array and display the grades
       for (int i =0; i < tests.length; i++){
           System.out.println("Test #" + (i + 1) + ": " + "score = " + tests[i].getScore() +
                   ", grade = " + tests[i].getGrade());
       }
    }


}
