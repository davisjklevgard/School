package edu.cvtc.java;

public class InterfaceDemo {

    public static void main(String[] args) {

        FinalExam2 exam1 = new FinalExam2(100, 6);
        FinalExam2 exam2 = new FinalExam2(50, 4);


        if (exam1.equals(exam2)){
            System.out.println("Equal");
        }

        if (exam1.greaterThan(exam2)){
            System.out.println("Greater than");
        }

        if (exam1.lessThan(exam2)){
            System.out.println("Less Than");
        }

    }
}
