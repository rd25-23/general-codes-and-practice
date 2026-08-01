import java.util.Scanner;

class Mobile {

    int price;
    String model, brand;

    Mobile(int a, String b, String c) {

        price = a;
        model = b;
        brand = c;
    }

    void display() {
        System.out.println("Price: " + price);
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
    }
}

public class MobileMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the price of the mobile:");
        int price = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the model of the mobile:");
        String model = sc.nextLine();

        System.out.print("Enter the brand of the mobile:");
        String brand = sc.nextLine();

        Mobile mobile = new Mobile(price, model, brand);
        mobile.display();
        sc.close();
    }
}