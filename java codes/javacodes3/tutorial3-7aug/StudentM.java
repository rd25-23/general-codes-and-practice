import java.util.Scanner;

public class StudentM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store marks of 5 subjects
        int[] marks = new int[5];
        int total = 0;

        System.out.println("Enter the marks of 5 subjects:");

        // For loop to read marks, store them in the array, and calculate the total
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Marks for Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            total += marks[i];
        }

        System.out.println("\nTotal Marks: " + total);

        if (total >= 400) {
            System.out.println("Result: Pass with Distinction");
        } else {
            System.out.println("Result: Pass");
        }

        scanner.close();
    }
}
