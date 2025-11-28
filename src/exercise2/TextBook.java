package exercise2;

import exercise1.Book;
import exercise1.BookLocation;

public class TextBook extends Book {
    private final String subject;

    public TextBook(String isbn, String title, String author, BookLocation location, String subject) {
        super(isbn, title, author, location);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public void setLocation(BookLocation location) {
        throw new UnsupportedOperationException("TextBook location cannot be changed");
    }

    @Override
    public String toString() {
        return "TextBook{" +
                "isbn='" + super.getIsbn() + '\'' +
                ", title='" + super.getTitle() + '\'' +
                ", author='" + super.getAuthor() + '\'' +
                ", location=" + super.getLocation() +
                ", subject=" + subject +
                '}';
    }
}
