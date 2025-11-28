package exercise2;

import exercise1.Book;
import exercise1.BookLocation;

public class Novel extends Book {
    private final String genre;

    public Novel(String isbn, String title, String author, BookLocation location, String genre) {
        super(isbn, title, author, location);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Novel{" +
                "isbn='" + super.getIsbn() + '\'' +
                ", title='" + super.getTitle() + '\'' +
                ", author='" + super.getAuthor() + '\'' +
                ", location=" + super.getLocation() +
                ", genre=" + genre +
                '}';
    }
}
