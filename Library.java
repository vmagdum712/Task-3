package management;

import java.util.*;

public class Library {
    private List<Book> books;
    private List<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added: " + user.getName());
    }

    public Book findBookById(int bookId) {
        for (Book b : books) {
            if (b.getBookId() == bookId) {
                return b;
            }
        }
        return null;
    }

    public User findUserById(int userId) {
        for (User u : users) {
            if (u.getUserId() == userId) {
                return u;
            }
        }
        return null;
    }

    public void issueBook(int bookId, int userId) {
        Book book = findBookById(bookId);
        User user = findUserById(userId);

        if (book != null && user != null) {
            user.borrowBook(book);
        } else {
            System.out.println("Book or User not found!");
        }
    }

    public void returnBook(int bookId, int userId) {
        Book book = findBookById(bookId);
        User user = findUserById(userId);

        if (book != null && user != null) {
            user.returnBook(book);
        } else {
            System.out.println("Book or User not found!");
        }
    }

    public void showAllBooks() {
        System.out.println("\n--- List of Books ---");
        for (Book b : books) {
            b.displayBookDetails();
        }
    }

    public void showAllUsers() {
        System.out.println("\n--- List of Users ---");
        for (User u : users) {
            u.displayUserDetails();
        }
    }
}
