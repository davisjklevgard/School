package edu.cvtc.java;

public class StudentEnrollment {

    public static void main(String[] args) {

        // Declare our objects
        // Student objects
        Student james = new Student();
        Student amber = new Student();
        Student hannah = new Student();
        Student ryan = new Student();
        Student chris = new Student();

        // Course objects
        Course web1 = new Course();
        Course progFun = new Course();
        Course mathLogic = new Course();
        Course writComm = new Course();

        // Enrollment objects
        Enrollment jamesList = new Enrollment();
        Enrollment amberList = new Enrollment();
        Enrollment hannahList = new Enrollment();
        Enrollment ryanList = new Enrollment();
        Enrollment chrisList = new Enrollment();

        // End of object declaration

        // Fill the student objects with information
        james.setName("James Thomas");
        james.setAddress("123 First Street");
        james.setPhoneNumber("(111) 111-1111");
        james.setEmail("jthomas@student.cvtc.edu");
        james.setStudentId("1111A");

        amber.setName("Amber Taylor");
        amber.setAddress("123 Second Street");
        amber.setPhoneNumber("(222) 222-2222");
        amber.setEmail("ataylor@student.cvtc.edu");
        amber.setStudentId("2222B");

        hannah.setName("Hannah Clark");
        hannah.setAddress("123 Third Street");
        hannah.setPhoneNumber("(333) 333-3333");
        hannah.setEmail("hclark@student.cvtc.edu");
        hannah.setStudentId("3333C");

        chris.setName("Chris Martin");
        chris.setAddress("123 Fourth Street");
        chris.setPhoneNumber("(444) 444-4444");
        chris.setEmail("cmartin@student.cvtc.edu");
        chris.setStudentId("4444D");

        ryan.setName("Ryan Brooks");
        ryan.setAddress("123 Fifth Street");
        ryan.setPhoneNumber("(555) 555-5555");
        ryan.setEmail("rbrooks@student.cvtc.edu");
        ryan.setStudentId("5555E");

        // Fill the course objects with information
        web1.setName("Web 1");
        web1.setDescription("An introduction to HTML & CSS");
        web1.setCost(350.0);
        web1.setRoomNumber("BEC 176");

        progFun.setName("Programming Fundamentals");
        progFun.setDescription("An introduction to Programming");
        progFun.setCost(400.0);
        progFun.setRoomNumber("BEC 176");

        mathLogic.setName("Math & Logic");
        mathLogic.setDescription("A math class with a logic emphasis");
        mathLogic.setCost(450.0);
        mathLogic.setRoomNumber("BEC 202");

        writComm.setName("Written Communication");
        writComm.setDescription("An english class to improve writing skills");
        writComm.setCost(450.0);
        writComm.setRoomNumber("BEC 240");

        // Set courses for each student
        Course[] jamesCourses = {web1, progFun, mathLogic};
        Course[] amberCourses = {mathLogic};
        Course[] hannahCourses = {progFun, web1};
        Course[] ryanCourses = {web1, writComm};
        Course[] chrisCourses = {web1, progFun, mathLogic, writComm};

        // Fill the enrollment objects
        jamesList.setStudent(james);
        jamesList.setCourses(jamesCourses);

        amberList.setStudent(amber);
        amberList.setCourses(amberCourses);

        hannahList.setStudent(hannah);
        hannahList.setCourses(hannahCourses);

        ryanList.setStudent(ryan);
        ryanList.setCourses(ryanCourses);

        chrisList.setStudent(chris);
        chrisList.setCourses(chrisCourses);

        // Display student information
        System.out.println("----- Student -----");
        System.out.println("Student Name: " + james.getName());
        System.out.println("Address: " + james.getAddress());
        System.out.println("Phone Number: " + james.getPhoneNumber());
        System.out.println("Email: " + james.getEmail());
        System.out.println("Student ID: " + james.getStudentId());
        System.out.println("");

        // Display course listing for a student
        System.out.println("----- Courses -----");
        for (int i = 0; i < jamesCourses.length; i++) {
            System.out.println("Course #" + (i + 1));
            System.out.println("Course Name: " + jamesCourses[i].getName());
            System.out.println("Course Description: " + jamesCourses[i].getDescription());
            System.out.println("Course Cost: " + jamesCourses[i].getCost());
            System.out.println("Course Room Number: " + jamesCourses[i].getRoomNumber());
            System.out.println("");
        }

        System.out.println("----- Student -----");
        System.out.println("Student Name: " + amber.getName());
        System.out.println("Address: " + amber.getAddress());
        System.out.println("Phone Number: " + amber.getPhoneNumber());
        System.out.println("Email: " + amber.getEmail());
        System.out.println("Student ID: " + amber.getStudentId());
        System.out.println("");

        // Display course listing for a student
        System.out.println("----- Courses -----");
        for (int i = 0; i < amberCourses.length; i++) {
            System.out.println("Course #" + (i + 1));
            System.out.println("Course Name: " + amberCourses[i].getName());
            System.out.println("Course Description: " + amberCourses[i].getDescription());
            System.out.println("Course Cost: " + amberCourses[i].getCost());
            System.out.println("Course Room Number: " + amberCourses[i].getRoomNumber());
            System.out.println("");
        }

    }

}
