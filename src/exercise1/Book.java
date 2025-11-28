package exercise1;

import java.util.Objects;

public class Book {
    private final String isbn;
    private final String title;
    private final String author;
    private BookLocation location;

    public Book(String isbn, String title, String author, BookLocation location) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.location = location;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public BookLocation getLocation() {
        return location;
    }

    public void setLocation(BookLocation location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "exercise1.Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", location=" + location +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, author, location);
    }
}
