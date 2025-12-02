package exercise5;

import exercise1.Book;
import exercise1.BookLocation;
import exercise3.Library;
import exercise4.SearchByTitle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NewTest {
    @Test
    public void testObserverAddBook() {
        BookLocation locA1 = new BookLocation("A", 1);

        Book b1 = new Book("111", "Clean Code", "Robert Martin", locA1);
        Book b2 = new Book("222", "Effective Java", "Joshua Bloch", locA1);

        Library lib = new Library(new SearchByTitle());

        lib.addBook(b1);
        lib.addBook(b2);

        assertEquals(2, locA1.getBooks().size());
    }

    @Test
    public void testObserverRemoveBook() {
        BookLocation locA1 = new BookLocation("A", 1);

        Book b1 = new Book("111", "Clean Code", "Robert Martin", locA1);
        Book b2 = new Book("222", "Effective Java", "Joshua Bloch", locA1);

        Library lib = new Library(new SearchByTitle());

        lib.addBook(b1);
        lib.addBook(b2);

        lib.removeBook(b1);

        assertEquals(1, locA1.getBooks().size());
    }
}
