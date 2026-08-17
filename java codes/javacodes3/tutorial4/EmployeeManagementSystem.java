package javacodes3.tutorial4;

import java.util.Scanner;

// Employee class to hold data and operational methods
class Employee {
    int empId;
    String name;
    double monthlySalary;

    // Constructor to initialize employee details
    public Employee(int empId, String name, double monthlySalary) {
        this.empId = empId;
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    // Method to calculate the annual salary
    public double calculateAnnualSalary() {
        return monthlySalary * 12;
    }

    // Method to check if the employee is eligible for a bonus
    // Condition: Monthly salary must be ₹30,000 or more
    public boolean checkBonusEligibility() {
        return monthlySalary >= 30000;
    }

    // Method to calculate the bonus based on eligibility
    public double calculateBonus() {
        if (checkBonusEligibility()) {
            return calculateAnnualSalary() * 0.10; // 10% of the annual salary
        } else {
            return 0.0; // No bonus if not eligible
        }
    }

    // Method to display all employee details, salaries, and bonus status
    public void displayDetails() {
        double annualSalary = calculateAnnualSalary();
        boolean isEligible = checkBonusEligibility();
        double bonus = calculateBonus();

        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Monthly Salary: ₹" + (long) monthlySalary);
        System.out.println("Annual Salary: ₹" + (long) annualSalary);
        System.out.println("Bonus Eligible: " + (isEligible ? "Yes" : "No"));
        System.out.println("Annual Bonus: ₹" + (long) bonus);
        System.out.println("Total Annual Compensation: ₹" + (long) (annualSalary + bonus));
        System.out.println("--------------------------------------------------");
    }
}

// Main class to run the application
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an array to store 5 Employee objects
        Employee[] employees = new Employee[5];

        System.out.println("--- Enter Details for 5 Employees ---");

        // Loop to populate the employee array using user input
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Employee " + (i + 1) + ":");

            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume the leftover newline character

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Monthly Salary: ");
            double salary = scanner.nextDouble();

            // Instantiating the Employee object and storing it in the array
            employees[i] = new Employee(id, name, salary);
            System.out.println();
        }

        System.out.println("\n=== Employee Annual Compensation Report ===");

        // Loop to process and display the details for all employees
        for (int i = 0; i < employees.length; i++) {
            employees[i].displayDetails();
        }

        scanner.close();
    }
}
