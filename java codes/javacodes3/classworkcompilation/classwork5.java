import java.util.Scanner;

public class classwork5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter score for Student 1: ");
        int score1 = sc.nextInt();

        System.out.print("Enter score for Student 2: ");
        int score2 = sc.nextInt();

        System.out.print("Enter score for Student 3: ");
        int score3 = sc.nextInt();

        int max = score1;
        String winner = "Student 1";

        if (score2 > max) {
            max = score2;
            winner = "Student 2";
        }

        if (score3 > max) {
            max = score3;
            winner = "Student 3";
        }

        System.out.println("\n--- Results ---");
        System.out.println("Highest score: " + max);
        System.out.println("Winner: " + winner);

        sc.close();
    }
}
