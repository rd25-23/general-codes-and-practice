import java.util.Scanner;

class Circle {

    double radius;

    Circle(double r) {
        radius = r;
    }

    void display() {
        double area = 3.14 * radius * radius;
        double circumference = 2 * 3.14 * radius;
        System.out.println("The area of circle is " + area);
        System.out.println("The circumferecne of circle is " + circumference);
    }

}

public class se {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of circle");
        double radius = sc.nextDouble();

        Circle t = new Circle(radius);
        t.display();
    }
}