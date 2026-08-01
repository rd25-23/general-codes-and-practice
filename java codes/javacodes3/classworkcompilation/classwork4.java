import java.util.Scanner;

public class classwork4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first student's roll number: ");
        int roll1 = sc.nextInt();

        System.out.print("Enter the second student's roll number: ");
        int roll2 = sc.nextInt();

        int originalRoll1 = roll1;
        int originalRoll2 = roll2;

        System.out.println("\n--- Original Roll Numbers ---");
        System.out.println("Student 1: " + roll1);
        System.out.println("Student 2: " + roll2);

        int temp = roll1;
        roll1 = roll2;
        roll2 = temp;

        System.out.println("\n--- After Swap (Method A: Using Temp Variable) ---");
        System.out.println("Student 1: " + roll1);
        System.out.println("Student 2: " + roll2);

        roll1 = originalRoll1;
        roll2 = originalRoll2;

        roll1 = roll1 + roll2;
        roll2 = roll1 - roll2;
        roll1 = roll1 - roll2;

        System.out.println("\n--- After Swap (Method B: Without Temp Variable) ---");
        System.out.println("Student 1: " + roll1);
        System.out.println("Student 2: " + roll2);

        sc.close();
    }
}
