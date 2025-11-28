package exercise4;

import exercise1.Book;
import java.util.Collection;


public class SearchByAuthor implements SearchStrategy{

    @Override
    public Collection<Book> search(String query, Collection<Book> books) {
        return books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(query))
                .toList();
    }
}
