// Book class
class Book {
    String title;
    String author;
    double price;

    // Default Constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized Constructor
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
        System.out.println();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Using Default Constructor
        Book book1 = new Book();
        book1.displayDetails();

        // Using Parameterized Constructor
        Book book2 = new Book("Java Programming", "James Gosling", 499.0);
        book2.displayDetails();
    }
}
