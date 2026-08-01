import java.util.Scanner;

public class classwork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Register Number: ");
        String regNo = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Year of Study (e.g., 1, 2, 3, 4): ");
        int year = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter College Name: ");
        String college = sc.nextLine();

        System.out.println("\n=============================");
        System.out.println("     STUDENT INFORMATION     ");
        System.out.println("=============================");
        System.out.println("Name          : " + name);
        System.out.println("Register No   : " + regNo);
        System.out.println("Department    : " + dept);
        System.out.println("Year of Study : " + year);
        System.out.println("College       : " + college);
        System.out.println("=============================");

        sc.close();
    }
}
