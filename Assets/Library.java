import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 
 * 
 * 
 * @Author
 * @Version
 */
public class Library {

    private List<Book> books;

    /**
     * 
     */
    Library() {
        books = new ArrayList<>();

    }

    /**
     * 
     * 
     * @param book
     * @return
     */
    public List<Book> addBook(Book book) {
        books.add(book);
        return books;
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> getBooks() {

        return books;

    }

    public Book searchBook(Book book) {
        return books.get(books.indexOf(book));
    }

    public List<Book> displayAllBooks() {
        for (Book b : books) {
            System.out.println(b.getAuthor() + " " + b.getTitle() + " " + b.getGenre());
        }
        return books;
    }

}
