package management;

import java.util.*;

public class User {
    private int userId;
    private String name;
    private List<Book> borrowedBooks;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void borrowBook(Book book) {
        if (book != null && !book.isIssued()) {
            borrowedBooks.add(book);
            book.issuebook();
        } else {
            System.out.println("Book cannot be borrowed right now.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.returnbook();
        } else {
            System.out.println("This book is not borrowed by " + name + ".");
        }
    }

    public void displayUserDetails() {
        System.out.println("\nUser ID: " + userId + " | Name: " + name);
        System.out.println("Borrowed Books:");
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books borrowed.");
        } else {
            for (Book b : borrowedBooks) {
                System.out.println("- " + b.gettitle());
            }
        }
    }
}
