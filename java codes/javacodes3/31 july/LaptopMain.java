import java.util.Scanner;

class Laptop {

    int ramsize;
    String brand, processor;

    Laptop(int r, String b, String p) {
        ramsize = r;
        brand = b;
        processor = p;
    }

    void display() {
        System.out.println("RAM Size: " + ramsize);
        System.out.println("Brand: " + brand);
        System.out.println("Processor: " + processor);
    }

}

public class LaptopMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the RAM size of the laptop:");
        int ramsize = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the brand of the laptop:");
        String brand = sc.nextLine();

        System.out.print("Enter the processor of the laptop:");
        String processor = sc.nextLine();

        Laptop laptop = new Laptop(ramsize, brand, processor);
        laptop.display();
        sc.close();
    }
}