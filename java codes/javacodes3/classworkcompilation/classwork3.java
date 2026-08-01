import java.util.Scanner;

public class classwork3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking dimensions input from the user
        System.out.print("Enter the length of the playground: ");
        double length = sc.nextDouble();

        System.out.print("Enter the breadth of the playground: ");
        double breadth = sc.nextDouble();

        // Calculating the area
        double area = length * breadth;

        // Displaying the result neatly
        System.out.println("\n--- Playground Details ---");
        System.out.println("Length : " + length + " meters");
        System.out.println("Breadth: " + breadth + " meters");
        System.out.println("Area   : " + area + " square meters");
        System.out.println("--------------------------");

        sc.close();
    }
}
