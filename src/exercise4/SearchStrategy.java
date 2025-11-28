package exercise4;

import exercise1.Book;

import java.util.Collection;

public interface SearchStrategy {
    public Collection<Book> search(String query, Collection<Book> books);
}
