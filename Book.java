package management;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean isIssued;

    public Book(int bookId , String title, String author){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }
     public int getBookId(){
        return bookId;
     }
     public String gettitle(){
        return title;
     }
     public String getauthor(){
        return author;
     }
     public boolean isIssued(){
        return isIssued;
     }
     public void issuebook(){
        if (isIssued){
            System.out.println("Book \"" + title + "\" is already issued.");
        }else{
            isIssued = true;
            System.out.println("Book \"" + title + "\" issued successfully.");
        }
     }
     public void returnbook(){
        if(!isIssued){
            System.out.println("Book \"" + title + "\" was not issued.");
        }else{
            isIssued = false;
            System.out.println("Book \"" + title + "\" returned successfully.");
        }
     }
     public void displayInfo(){
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Issued: " + (isIssued ? "Yes" : "No"));
     }
     public void displayBookDetails() {System.out.println("  ID: " + bookId + 
                           ", Title: " + title + 
                           ", Author: " + author + 
                           ", Available: " + (isIssued ? "Yes" : "No"));
    }
    
    @Override
    public String toString() {
        return "Book [ID=" + bookId + ", Title=" + title + ", Author=" + author + "]";
    }
}