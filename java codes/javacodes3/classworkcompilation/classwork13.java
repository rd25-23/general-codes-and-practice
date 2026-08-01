import java.util.Scanner;

public class classwork13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks for Student 1: ");
        double m1 = sc.nextDouble();

        System.out.print("Enter marks for Student 2: ");
        double m2 = sc.nextDouble();

        if (m1 > m2) {
            System.out.println("Student 1 has the higher mark.");
        } else if (m2 > m1) {
            System.out.println("Student 2 has the higher mark.");
        } else {
            System.out.println("Both students have the same marks.");
        }

        sc.close();
    }
}
