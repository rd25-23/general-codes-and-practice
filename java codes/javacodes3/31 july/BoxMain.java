import java.util.Scanner;

class Box {

    int length, Breadth, height;

    Box(int l, int b, int h) {
        length = l;
        Breadth = b;
        height = h;
    }

    void displayvolume() {

        System.out.println("Volume: " + (length * Breadth * height));

    }

}

class BoxMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length, breadth and height of box: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();

        Box box1 = new Box(l, b, h);
        box1.displayvolume();

        sc.close();
    }
}