import java.util.Scanner;

public class WeeklySales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] sales = new double[7];
        double totalSales = 0.0;

        System.out.println("Enter the sales amount for each of the 7 days:");

        for (int i = 0; i < sales.length; i++) {
            System.out.print("Day " + (i + 1) + " Sales: ₹");
            sales[i] = scanner.nextDouble();
            totalSales += sales[i];
        }

        System.out.println("\nTotal Weekly Sales: ₹" + totalSales);

        if (totalSales > 50000) {
            System.out.println("Result: Target Achieved");
        } else {
            System.out.println("Result: Target Not Achieved");
        }

        scanner.close();
    }
}
