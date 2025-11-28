package exercise4;

import exercise1.Book;

import java.util.Collection;
import java.util.List;

public class SearchByTitle implements SearchStrategy{
    @Override
    public Collection<Book> search(String query, Collection<Book> books) {
        return books.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(query))
                .toList();
    }
}
