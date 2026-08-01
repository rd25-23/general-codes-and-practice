import java.util.Scanner;

public class classwork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the price of the first product: ");
        double price1 = sc.nextDouble();

        System.out.print("Enter the price of the second product: ");
        double price2 = sc.nextDouble();

        double total = price1 + price2;
        double difference = price1 - price2;
        double product = price1 * price2;
        double quotient = price1 / price2;
        double remainder = price1 % price2;

        System.out.println("\n--- Calculation Results ---");
        System.out.println("Total (Addition)         : " + total);

        System.out.println("Difference (Subtraction) : " + Math.abs(difference));

        System.out.println("Product (Multiplication) : " + product);
        System.out.println("Quotient (Division)      : " + quotient);
        System.out.println("Remainder (Modulo)       : " + remainder);
        System.out.println("---------------------------");

        sc.close();
    }
}
