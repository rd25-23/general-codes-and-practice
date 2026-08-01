import java.util.Scanner;

class Car {

    String Brand, Model;
    int price;

    Car(String a, String b, int c) {
        Brand = a;
        Model = b;
        price = c;
    }

    void display() {
        System.out.println("Brand: " + Brand);
        System.out.println("Model: " + Model);
        System.out.println("Price: " + price);
    }

}

class CarMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Brand of the car:");
        String Brand = sc.nextLine();

        System.out.print("Enter the Model of the car:");
        String Model = sc.nextLine();

        System.out.print("Enter the Price of the car:");
        int price = sc.nextInt();

        Car car = new Car(Brand, Model, price);
        car.display();

        sc.close();
    }
}