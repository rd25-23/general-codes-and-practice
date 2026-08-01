import java.util.Scanner;

public class classwork8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();

        System.out.print("Enter allowance: ");
        double allowance = sc.nextDouble();

        double totalSalary = basic + allowance;

        System.out.println("Total Salary: " + totalSalary);

        sc.close();
    }
}
