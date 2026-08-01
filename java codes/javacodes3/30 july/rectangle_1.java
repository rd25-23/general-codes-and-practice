import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;

    void setData(int l, int b) {
        length = l;
        breadth = b;
    }

    int calculateArea() {
        return length * breadth;
    }

    void displayArea() {
        System.out.println("Area of Rectangle = " + calculateArea());
    }
}

public class rectangle_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle rect = new Rectangle();

        System.out.print("Enter Length: ");
        int length = sc.nextInt();

        System.out.print("Enter Breadth: ");
        int breadth = sc.nextInt();

        rect.setData(length, breadth);
        rect.displayArea();

        sc.close();
    }
}