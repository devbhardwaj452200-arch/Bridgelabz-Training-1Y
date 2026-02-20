// Interface
interface FineCalculator {
    double calculateFine(int daysLate);
}

// Abstract Class
abstract class Book implements FineCalculator {
    protected int bookId;
    protected String title;
    protected double price;

    // Static variable shared across all books
    static String libraryName = "City Central Library";

    // Constructor
    public Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    // Abstract method (will be overridden)
    public abstract double calculateFine(int daysLate);

    // Common display method
    public void display() {
        System.out.println("Library: " + libraryName);
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Price: ₹" + price);
    }
}

// Child class TextBook
class TextBook extends Book {

    public TextBook(int bookId, String title, double price) {
        super(bookId, title, price);
    }

    // ₹2 per day fine
    @Override
    public double calculateFine(int daysLate) {
        return daysLate * 2;
    }
}

// Child class Magazine
class Magazine extends Book {

    public Magazine(int bookId, String title, double price) {
        super(bookId, title, price);
    }

    // ₹5 per day fine
    @Override
    public double calculateFine(int daysLate) {
        return daysLate * 5;
    }
}

// Main Class
public class SmartLibrarySystem {
    public static void main(String[] args) {

        // Parent reference (Polymorphism)
        Book b1 = new TextBook(101, "Java Programming", 450);
        Book b2 = new Magazine(202, "Tech Monthly", 120);

        b1.display();
        System.out.println("Fine (5 days late): ₹" + b1.calculateFine(5));

        System.out.println("------------------------");

        b2.display();
        System.out.println("Fine (5 days late): ₹" + b2.calculateFine(5));
    }
}