import java.util.*;

public class LibraryCatalog {

    public static void main(String[] args) {

        // Step 1: Create Map (ISBN -> Title)
        Map<String, String> library = new HashMap<>();

        // Add books
        library.put("978-1234567890", "Java Programming");
        library.put("978-1111111111", "Data Structures");
        library.put("978-2222222222", "Operating Systems");
        library.put("978-3333333333", "Database Systems");
        library.put("978-4444444444", "Computer Networks");

        // Step 2: Search by ISBN
        searchByISBN(library, "978-1234567890");
        searchByISBN(library, "978-9999999999"); // not found

        // Step 3: Remove a book
        removeBook(library, "978-2222222222");

        // Step 4: Print sorted catalog
        System.out.println("\nLibrary Catalog (Sorted by ISBN):");
        Map<String, String> sorted = new TreeMap<>(library);

        for (Map.Entry<String, String> entry : sorted.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Step 5: Search by Title (extension)
        searchByTitle(library, "Java Programming");
        searchByTitle(library, "Artificial Intelligence"); // not found
    }

    // Search by ISBN
    public static void searchByISBN(Map<String, String> library, String isbn) {
        if (library.containsKey(isbn)) {
            System.out.println("Book Found: " + library.get(isbn));
        } else {
            System.out.println("Book not found for ISBN: " + isbn);
        }
    }

    // Remove book
    public static void removeBook(Map<String, String> library, String isbn) {
        if (library.containsKey(isbn)) {
            library.remove(isbn);
            System.out.println("Book removed: " + isbn);
        } else {
            System.out.println("Cannot remove. Book not found.");
        }
    }

    // Search by Title (iterate map)
    public static void searchByTitle(Map<String, String> library, String title) {
        boolean found = false;

        for (Map.Entry<String, String> entry : library.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(title)) {
                System.out.println("Title Found! ISBN: " + entry.getKey());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found with title: " + title);
        }
    }
}
