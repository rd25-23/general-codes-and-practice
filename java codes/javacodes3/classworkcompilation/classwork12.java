import java.util.Scanner;

public class classwork12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of units consumed: ");
        double units = sc.nextDouble();

        System.out.print("Enter charge per unit: ");
        double charge = sc.nextDouble();

        double totalBill = units * charge;

        System.out.println("Total Bill Amount: " + totalBill);

        sc.close();
    }
}
