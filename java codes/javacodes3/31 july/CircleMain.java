import java.util.Scanner;

class Circle {

    double radius;

    Circle(double r) {
        radius = r;
    }

    void display() {
        double area = Math.PI * radius * radius;

        System.out.println("Area of Circle: " + area);
    }
}

public class CircleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        Circle circle = new Circle(radius);
        circle.display();

        sc.close();
    }
}
