package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        Student testCase = new Student("Darren LaCour", 215, 1, 4.0);
        System.out.println("Student name: " + testCase.getName());
        System.out.println("Student ID: " + testCase.getStudentId());
        System.out.println("Number of credits: " + testCase.getNumberOfCredits());
        System.out.println("GPA: " + testCase.getGpa());
    }

}
