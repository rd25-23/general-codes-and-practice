package javacodes3.tutorial4;

import java.util.Scanner;

// Patient class to hold details and billing operations
class Patient {
    String name;
    double consultationFee;

    // Parameterized constructor to initialize patient details
    public Patient(String name, double consultationFee) {
        this.name = name;
        this.consultationFee = consultationFee;
    }

    // Method with an argument to calculate the final consultation amount
    public double calculateFinalAmount(double discountAmount) {
        return consultationFee - discountAmount;
    }

    // Separate method to evaluate the discount and display the final bill
    public void displayBillingDetails() {
        double discountRate;

        // Determine the discount percentage based on the fee
        if (consultationFee >= 2000) {
            discountRate = 0.10; // 10% discount
        } else {
            discountRate = 0.05; // 5% discount
        }

        double discountAmount = consultationFee * discountRate;

        // Calling the method with arguments to get the final payable amount
        double finalAmount = calculateFinalAmount(discountAmount);

        // Displaying the required output fields
        System.out.println("Patient Name: " + name);
        System.out.println("Original Consultation Fee: ₹" + (long) consultationFee);
        System.out.println("Discount Applied: ₹" + (long) discountAmount);
        System.out.println("Final Amount Payable: ₹" + (long) finalAmount);
        System.out.println("--------------------------------------------------");
    }
}

// Main class
public class HospitalBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Storing the details of 5 patients using an array of objects
        Patient[] patients = new Patient[5];

        System.out.println("--- Enter Consultation Details for 5 Patients ---");

        // Loop to populate the patient array
        for (int i = 0; i < patients.length; i++) {
            System.out.println("Patient " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Consultation Fee: ");
            double fee = scanner.nextDouble();
            scanner.nextLine(); // Consume the leftover newline character

            // Initializing the object using the parameterized constructor
            patients[i] = new Patient(name, fee);
            System.out.println();
        }

        System.out.println("\n=== Final Consultation Billing Report ===");

        // Loop to process and display billing details for all 5 patients
        for (int i = 0; i < patients.length; i++) {
            patients[i].displayBillingDetails();
        }

        scanner.close();
    }
}
