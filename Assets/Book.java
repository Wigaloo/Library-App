public class Book {
    private String title;
    private String author;
    private String genre;

    Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    /**
     * This method returns author from the class Book
     * 
     * @return String type author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This method simply returns genre from the genre class.
     * 
     * @see Genre.java
     * @return String type genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * This method simply formats the book information, title, author, genre.
     * 
     * @return The formated string
     */
    public String toString() {
        return title + " by " + author + " and genre is " + genre;
    }
}
