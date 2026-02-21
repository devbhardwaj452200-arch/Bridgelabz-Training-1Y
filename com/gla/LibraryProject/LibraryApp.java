import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class LibraryApp {

    public static void main(String[] args) {

        // 1. Adding a new book
        Book b1 = new Book("The Alchemist", "Paulo Coelho", "ISBN001");
        System.out.println("---- Book Added ----");
        b1.displayBook();

        // 2. Registering a new member
        Member m1 = new Member("Riya Sharma", 1001);
        System.out.println("\n---- Member Registered ----");
        m1.displayMember();

        // 3. Issuing a book to a member
        System.out.println("\n---- Issuing Book ----");
        Transaction.issueBook(b1, m1);

        // Display book status after issuing
        System.out.println("\n---- Book Status After Issue ----");
        b1.displayBook();
    }
}