public class Mobile {
    private String brand;
    private double price;

    public Mobile() {
        this.brand = "Unknown";
        this.price = 0.0;
    }

    public Mobile(String brand) {
        this.brand = brand;
        this.price = 0.0;
    }

    public Mobile(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println(" | Brand: " + brand + " | Price: ₹" + price);
    }

    public static void main(String[] args) {

        System.out.println("--- No Details Provided ---");
        Mobile mobile1 = new Mobile();
        mobile1.displayDetails();

        System.out.println("\n--- Only Brand Provided ---");
        Mobile mobile2 = new Mobile("Samsung");
        mobile2.displayDetails();

        System.out.println("\n--- Brand and Price Provided ---");
        Mobile mobile3 = new Mobile("Apple\n", 85000.0);
        mobile3.displayDetails();
    }
}
