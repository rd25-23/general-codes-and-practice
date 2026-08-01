import java.util.Scanner;

class Circle {
    double radius;

    void setData(double r) {
        radius = r;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    void display() {
        System.out.println("Area of Circle = " + calculateArea());
        System.out.println("Circumference of Circle = " + calculateCircumference());
    }
}

public class circle_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle c = new Circle();

        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();

        c.setData(radius);
        c.display();

        sc.close();
    }
}