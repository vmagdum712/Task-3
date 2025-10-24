package management;

public class Main{
    public static void main (String args[]){
        Library library = new Library();

        Book b1 = new Book(1,"Java Basics","Vighnesh");
        Book b2 = new Book(2,"Python Basics","Alice");
        Book b3 = new Book(3,"C++ Basics","Bob");

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        User u1 = new User(101,"harsh");
        User u2 = new User(102,"mauli");

        library.addUser(u1);
        library.addUser(u2);
        library.showAllBooks();
        library.showAllUsers();

        System.out.println("\n   Issuing Books   ");
        library.issueBook(1,101);
        library.issueBook(2,102);

        System.out.println("\n   After Issue   ");
        library.showAllBooks();

        System.out.println("\n   Returning Books   ");
        library.returnBook(1,101);

        System.out.println("\n    after return");
        library.showAllBooks(); 
        library.showAllUsers();
    }
}