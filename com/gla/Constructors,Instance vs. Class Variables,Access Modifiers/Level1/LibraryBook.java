// Book class
class LibraryBook {
    String title;
    String author;
    double price;
    boolean availability;

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true; // Book is available by default
    }

    // Method to borrow a book
    void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("You have successfully borrowed \"" + title + "\".");
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently not available.");
        }
    }

    // Method to display book details
    void displayBook() {
        System.out.println("Book Details:");
        System.out.println("Title        : " + title);
        System.out.println("Author       : " + author);
        System.out.println("Price        : " + price);
        System.out.println("Availability : " + (availability ? "Available" : "Not Available"));
        System.out.println();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Creating a Book object
        Book book1 = new Book("Java Programming", "James Gosling", 499.0);
        book1.displayBook();

        // Borrowing the book
        book1.borrowBook();
        book1.displayBook();

        // Attempting to borrow again
        book1.borrowBook();
    }
}
