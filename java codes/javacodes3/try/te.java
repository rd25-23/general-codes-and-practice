import java.util.Scanner;

class Rectangle {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void display() {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

}

public class te {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        int length = sc.nextInt();

        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = sc.nextInt();

        Rectangle rectangle = new Rectangle(length, breadth);
        rectangle.display();

        sc.close();

    }
}
