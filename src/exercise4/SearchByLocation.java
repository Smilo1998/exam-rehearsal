package exercise4;

import exercise1.Book;

import java.util.Collection;
import java.util.List;

public class SearchByLocation implements SearchStrategy{
    @Override
    public Collection<Book> search(String query, Collection<Book> books) {
        return books
                .stream()
                .filter(book -> book.getLocation().toString().equals(query))
                .toList();
    }
}
