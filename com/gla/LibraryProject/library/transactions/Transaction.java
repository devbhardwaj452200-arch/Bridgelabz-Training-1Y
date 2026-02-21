package library.transactions;

import library.books.Book;
import library.members.Member;

public class Transaction {

    public static void issueBook(Book book, Member member) {
        if (!book.isIssued()) {
            book.issueBook();
            System.out.println("Book \"" + book.getTitle() + "\" issued to " + member.getName());
        } else {
            System.out.println("Book \"" + book.getTitle() + "\" is already issued!");
        }
    }

    public static void returnBook(Book book, Member member) {
        if (book.isIssued()) {
            book.returnBook();
            System.out.println("Book \"" + book.getTitle() + "\" returned by " + member.getName());
        } else {
            System.out.println("Book \"" + book.getTitle() + "\" was not issued.");
        }
    }
}