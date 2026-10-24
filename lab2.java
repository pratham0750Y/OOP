class Book {

    int bookId;
    String title;
    String author;
    double price;

    static int totalBooks = 0;

    Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;

        totalBooks++;
    }

    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }

    void search(int id) {
        if (bookId == id) {
            System.out.println("Book found by ID:");
            display();
        }
    }

    void search(String bookTitle) {
        if (title.equalsIgnoreCase(bookTitle)) {
            System.out.println("Book found by Title:");
            display();
        }
    }

    Book costlierBook(Book other) {
        if (this.price > other.price) {
            return this;
        } else {
            return other;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book(101, "Java Programming", "James", 500);
        Book b2 = new Book(102, "Python Programming", "Guido", 700);
        Book b3 = new Book(103, "Data Structures", "Mark", 600);

        b1.display();
        b2.display();
        b3.display();

        b1.search(101);

        b2.search("Python Programming");

        Book costly = b1.costlierBook(b2);

        System.out.println("Costlier Book:");
        costly.display();

        System.out.println("Total number of books created: " + Book.totalBooks);
    }
}
