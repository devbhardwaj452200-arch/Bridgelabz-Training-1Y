// Book class
class Book {
    public String ISBN;        // Public: accessible anywhere
    protected String title;    // Protected: accessible in subclass and package
    private String author;     // Private: accessible only within this class

    // Constructor
    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public getter for author
    public String getAuthor() {
        return author;
    }

    // Public setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("ISBN   : " + ISBN);
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println();
    }
}

// Subclass demonstrating access to public and protected members
class EBook extends Book {
    String format; // e.g., PDF, EPUB

    // Constructor
    EBook(String ISBN, String title, String author, String format) {
        super(ISBN, title, author);
        this.format = format;
    }

    // Display EBook details
    public void displayEBookDetails() {
        // Accessing protected member 'title' from superclass
        System.out.println("EBook Title   : " + title);
        System.out.println("ISBN          : " + ISBN);       // public accessible
        System.out.println("Author        : " + getAuthor()); // private accessed via public method
        System.out.println("Format        : " + format);
        System.out.println();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Creating a regular Book object
        Book b1 = new Book("978-0134685991", "Effective Java", "Joshua Bloch");
        b1.displayDetails();

        // Modifying author using public setter
        b1.setAuthor("J. Bloch");
        System.out.println("Updated Author: " + b1.getAuthor());
        System.out.println();

        // Creating an EBook object
        EBook ebook1 = new EBook("978-1492056270", "Learning Java", "Marc Loy", "PDF");
        ebook1.displayEBookDetails();
    }
}
