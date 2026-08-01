import java.util.Scanner;

public class classwork6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your seat number: ");
        int seat = sc.nextInt();

        if (seat % 2 == 0) {
            System.out.println("Seat " + seat + " is Even. Please go to the Even-numbered counter.");
        } else {
            System.out.println("Seat " + seat + " is Odd. Please go to the Odd-numbered counter.");
        }

        sc.close();
    }
}
