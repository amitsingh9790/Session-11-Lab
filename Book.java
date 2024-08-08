import java.util.ArrayList;

// The Book class represents a book with an ID, name, and author
public class Book {
    private int bookId;
    private String bookName;
    private String authorName;

    // Parameterized constructor to initialize the object.
    public Book(int bookId, String bookName, String autherName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = autherName;
    }
    // Non Parameterized constructor to initialize the default value in object.
    public Book(){
        bookId=0;
        bookName="Not assigned";
        authorName="Unknown";
    }

    // Getter for bookId
    public int getBookId() {
        return bookId;
    }

    // Getter for bookName
    public String getBookName() {
        return bookName;
    }

    // Getter for authorName
    public String getAuthorName() {
        return authorName;
    }

    // Setter for book id
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    // Setter for book Author
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    // Setter for Book Name
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}

class Main{
    public static void main(String[] args) {
        // Creating ArrayList to store book objects
        ArrayList<Book> bookList = new ArrayList<>();

        // Creating object of Book
        Book b1 = new Book(1,"The Power of Subconscious Mind","Dr. Joseph Murphy");
        Book b2 = new Book(2,"Think Like a Monk","Jay Shetty");
        Book b3 = new Book(3,"How to develop self confidence by Public Speaking","dale carnegie");

        // Add Book objects to the list
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);

        // To print all the books details using Advance for loop
        for (Book book : bookList) {
            System.out.println("BookId: "+book.getBookId()+", BookName: "+book.getBookName()+", Author: "+book.getAuthorName());
        }

    }
}
