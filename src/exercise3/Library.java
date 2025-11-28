package exercise3;

import exercise1.Book;
import exercise1.BookLocation;

import java.util.*;

public class Library {
    private HashMap<String , Book> bookSet;

    public Library() {
        this.bookSet = new HashMap<>();
    }

    public void addBook(Book book) {
        boolean isbnExists = bookSet.values()
                .stream()
                .anyMatch(v -> v.equals(book));

        if (isbnExists) {
            throw new DuplicateBookException("This book already exists in the library");
        }

        bookSet.put(book.getIsbn(), book);
    }

    public boolean removeBook(Book book) {
        return bookSet.remove(book.getIsbn(), book);
    }

    public Collection<Book> findBooksAtLocation(BookLocation location) {
        return bookSet.values()
                .stream()
                .filter(book -> book.getLocation().equals(location))
                .toList();
    }
}
