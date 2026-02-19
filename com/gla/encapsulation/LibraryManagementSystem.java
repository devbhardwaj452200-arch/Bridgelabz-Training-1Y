// Abstract class for library items
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Encapsulation: getters and setters
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Abstract method for loan duration
    public abstract int getLoanDuration();

    // Concrete method to display item details
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Interface for reservable items
interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

// Book class
class Book extends LibraryItem implements Reservable {
    private boolean isReserved;
    private String borrowerName; // Encapsulated borrower info

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    @Override
    public int getLoanDuration() {
        return 21; // Books can be loaned for 21 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved) {
            this.borrowerName = borrowerName;
            isReserved = true;
            System.out.println(getTitle() + " reserved by " + borrowerName);
        } else {
            System.out.println(getTitle() + " is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

// Magazine class
class Magazine extends LibraryItem implements Reservable {
    private boolean isReserved;
    private String borrowerName;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    @Override
    public int getLoanDuration() {
        return 7; // Magazines can be loaned for 7 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved) {
            this.borrowerName = borrowerName;
            isReserved = true;
            System.out.println(getTitle() + " reserved by " + borrowerName);
        } else {
            System.out.println(getTitle() + " is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

// DVD class
class DVD extends LibraryItem implements Reservable {
    private boolean isReserved;
    private String borrowerName;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    @Override
    public int getLoanDuration() {
        return 14; // DVDs can be loaned for 14 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved) {
            this.borrowerName = borrowerName;
            isReserved = true;
            System.out.println(getTitle() + " reserved by " + borrowerName);
        } else {
            System.out.println(getTitle() + " is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

// Main class to demonstrate polymorphism
import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<LibraryItem> libraryItems = new ArrayList<>();

        libraryItems.add(new Book("B001", "Effective Java", "Joshua Bloch"));
        libraryItems.add(new Magazine("M101", "National Geographic", "Various Authors"));
        libraryItems.add(new DVD("D501", "Inception", "Christopher Nolan"));

        // Reserve items
        for (LibraryItem item : libraryItems) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable reservableItem) {
                if (reservableItem.checkAvailability()) {
                    reservableItem.reserveItem("John Doe");
                } else {
                    System.out.println(item.getTitle() + " is not available for reservation.");
                }
            }
            System.out.println("---------------------------");
        }
    }
}
