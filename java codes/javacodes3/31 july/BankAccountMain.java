import java.util.Scanner;

class BankAccount {

    int accountNo;
    int balance;
    String accountHolder;

    BankAccount(int a, int b, String c) {
        accountNo = a;
        balance = b;
        accountHolder = c;
    }

    void display() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Balance   : " + balance);
        System.out.println("Account Holder: " + accountHolder);
    }

}

public class BankAccountMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the account number:");
        int accountNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the balance:");
        int balance = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the account holder's name:");
        String accountHolder = sc.nextLine();

        BankAccount account = new BankAccount(accountNo, balance, accountHolder);
        account.display();

        sc.close();
    }
}