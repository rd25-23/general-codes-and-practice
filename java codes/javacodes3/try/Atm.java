import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the withdrawl amount: ");
        int amount = sc.nextInt();
        int Ramount;
        if (amount % 100 == 0) {
            int a2knotes = amount / 2000;
            Ramount = amount % 2000;
            int a500notes = Ramount / 500;
            Ramount = Ramount % 500;
            int a200notes = Ramount / 200;
            Ramount = Ramount % 200;
            int a100notes = Ramount / 100;
            System.out.println("2000 notes x " + a2knotes + " ,500 notes x " + a500notes + " ,200 notes x " + a200notes
                    + " ,100 notes x " + a100notes);

        } else {
            System.out.println("Invalid Amount");
        }

    }
}