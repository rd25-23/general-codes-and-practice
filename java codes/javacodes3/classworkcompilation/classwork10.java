import java.util.Scanner;

public class classwork10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the price of the item: ");
        double price = sc.nextDouble();

        System.out.print("Enter the quantity purchased: ");
        int quantity = sc.nextInt();

        double totalBill = price * quantity;

        System.out.println("Total Bill Amount: " + totalBill);

        sc.close();
    }
}
