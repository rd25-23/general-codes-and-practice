package javacodes3.tutorial4;

import java.util.Scanner;

// Student class containing attributes and evaluation logic
class Student {
    int rollNo;
    String name;
    int[] marks = new int[3];
    double attendance;

    // Constructor
    public Student(int rollNo, String name, int[] marks, double attendance) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.attendance = attendance;
    }

    // Method to calculate total marks using a for loop
    public int getTotalMarks() {
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        return total;
    }

    // Method to calculate average marks
    public double getAverage() {
        return (double) getTotalMarks() / marks.length;
    }

    // Method to display student details and evaluate performance using ternary
    // operators
    public void displayStudentDetails() {
        double avg = getAverage();
        int total = getTotalMarks();

        // Using Ternary Operator to avoid multiple lines of branching code
        String result = (avg >= 50) ? "Pass" : "Fail";
        String scholarship = (avg >= 75 && attendance >= 80) ? "Eligible" : "Not Eligible";
        String performance = (avg >= 85) ? "Excellent" : "Good";

        System.out.println("Roll No: " + rollNo + " | Name: " + name);
        System.out.println("Total Marks: " + total + " | Average: " + String.format("%.2f", avg));
        System.out.println("Status: " + result);
        System.out.println("Scholarship: " + scholarship);
        System.out.println("Performance Classification: " + performance);
        System.out.println("--------------------------------------------------");
    }
}

// Main Class
public class StudentPerformanceSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5];

        System.out.println("--- Enter Details for 5 Students ---");

        // Loop to take input for 5 students
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + ":");

            System.out.print("Roll Number: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Name: ");
            String name = scanner.nextLine();

            int[] marks = new int[3];
            System.out.println("Enter marks for 3 subjects:");
            for (int j = 0; j < 3; j++) {
                System.out.print("  Subject " + (j + 1) + ": ");
                marks[j] = scanner.nextInt();
            }

            System.out.print("Attendance Percentage: ");
            double attendance = scanner.nextDouble();

            students[i] = new Student(rollNo, name, marks, attendance);
            System.out.println();
        }

        System.out.println("\n=== Student Performance Results ===");

        // Initializing the top student variable
        Student topStudent = students[0];

        // Loop to display results and identify the top student
        for (int i = 0; i < students.length; i++) {
            students[i].displayStudentDetails();

            // Using ternary operator here as well to continue avoiding traditional
            // if-statements
            topStudent = (students[i].getAverage() > topStudent.getAverage()) ? students[i] : topStudent;
        }

        // Displaying the student with the highest average
        System.out.println("=== Highest Performer ===");
        System.out.println("Top Student: " + topStudent.name);
        System.out.println("Highest Average: " + String.format("%.2f", topStudent.getAverage()));

        scanner.close();
    }
}
