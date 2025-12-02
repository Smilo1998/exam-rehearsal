package exercise1;

import exercise5.LocationTracker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

public class BookLocation implements LocationTracker {
    private final String section;
    private final int shelf;
    private final Collection<Book> booksAtLocation = new ArrayList<>();

    public BookLocation(String section, int shelf) {
        this.section = section;
        this.shelf = shelf;
    }

    public int getShelf() {
        return shelf;
    }

    public String getSection() {
        return section;
    }

    @Override
    public String toString() {
        return "exercise1.BookLocation{" +
                "section='" + section + '\'' +
                ", shelf=" + shelf +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookLocation that = (BookLocation) o;
        return shelf == that.shelf && Objects.equals(section, that.section);
    }

    @Override
    public int hashCode() {
        return Objects.hash(section, shelf);
    }

    @Override
    public void update(Book book, boolean isAdded) {
        if (isAdded) {
            if (!booksAtLocation.contains(book)) {
                booksAtLocation.add(book);
            }
        } else {
            booksAtLocation.remove(book);
        }
    }

    @Override
    public Collection<Book> getBooks() {
        return Collections.unmodifiableCollection(booksAtLocation);
    }
}
