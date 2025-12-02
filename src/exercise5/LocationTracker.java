package exercise5;

import exercise1.Book;

import java.util.Collection;

public interface LocationTracker {
    void update(Book book, boolean isAdded);
    Collection<Book> getBooks();
}
