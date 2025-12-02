package exercise3;

import exercise1.Book;
import exercise1.BookLocation;
import exercise4.SearchStrategy;

import java.util.*;

public class Library {
    private HashMap<String , Book> bookSet;
    private SearchStrategy searchStrategy;

    public Library(SearchStrategy searchStrategy) {
        this.bookSet = new HashMap<>();
        this.searchStrategy = searchStrategy;
    }

    public void setSearchStrategy(SearchStrategy searchStrategy) {
        this.searchStrategy = searchStrategy;
    }

    public void addBook(Book book) {
        boolean isbnExists = bookSet.values()
                .stream()
                .anyMatch(v -> v.equals(book));

        if (isbnExists) {
            throw new DuplicateBookException("This book already exists in the library");
        }

        bookSet.put(book.getIsbn(), book);

        BookLocation location = book.getLocation();
        location.update(book, true);
    }

    public boolean removeBook(Book book) {
        boolean removed = bookSet.remove(book.getIsbn(), book);

        if (removed) {
            BookLocation location = book.getLocation();
            location.update(book, false);
        }

        return removed;
    }

    public Collection<Book> search(String query) {
        return searchStrategy.search(query, bookSet.values());
    }
}
