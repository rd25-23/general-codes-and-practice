import java.util.Scanner;

class Product {
    int id;
    String name;
    double price;
    int quantity;

    // Constructor to initialize product details
    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate and display the final billing details
    public void displayBillingDetails() {
        double totalPrice = price * quantity;
        double discount;

        // Conditional control structure to determine discount percentage
        if (totalPrice >= 5000) {
            discount = totalPrice * 0.10; // 10% discount
        } else {
            discount = totalPrice * 0.05; // 5% discount
        }

        double finalPrice = totalPrice - discount;

        // Displaying output matching the requested sample format
        System.out.println("Product ID: " + id);
        System.out.println("Name: " + name);
        // Casting to (long) is used here to display clean integer amounts like the
        // sample output
        System.out.println("Total Price: ₹" + (long) totalPrice);
        System.out.println("Discount: ₹" + (long) discount);
        System.out.println("Final Price: ₹" + (long) finalPrice);
        System.out.println("-------------------------");
    }
}

// Main class
public class ProductBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an array of 5 Product objects
        Product[] products = new Product[5];

        System.out.println("--- Enter Details for 5 Products ---");

        // Looping structure to take input and populate the array of objects
        for (int i = 0; i < products.length; i++) {
            System.out.println("Product " + (i + 1) + ":");

            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume the leftover newline character

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Price: ");
            double price = scanner.nextDouble();

            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            // Instantiating the object and adding it to the array
            products[i] = new Product(id, name, price, quantity);
            System.out.println();
        }

        System.out.println("\n--- Final Billing Output ---");

        // Looping structure to display the processed billing details for all 5 products
        for (int i = 0; i < products.length; i++) {
            products[i].displayBillingDetails();
        }

        scanner.close();
    }
}
