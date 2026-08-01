import java.util.Scanner;

class Book {
    int bookid;
    String title, author;

    Book(int id, String t, String a) {
        bookid = id;
        title = t;
        author = a;
    }

    void display() {
        System.out.println("Book ID: " + bookid);
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
    }

}

public class BookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the  id of the book:");
        int id = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        System.out.print("Enter the title of the book:");
        String title = sc.nextLine();

        System.out.print("Enter the author of the book:");
        String author = sc.nextLine();

        Book book = new Book(id, title, author);
        book.display();

        sc.close();

    }
}
