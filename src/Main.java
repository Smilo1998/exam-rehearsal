import exercise1.Book;
import exercise1.BookLocation;
import exercise2.TextBook;
import exercise3.DuplicateBookException;
import exercise3.Library;
import exercise4.SearchByAuthor;
import exercise4.SearchByTitle;

public class Main {
    public static void main(String[] args) {

        BookLocation locA1 = new BookLocation("A", 1);
        BookLocation locA2 = new BookLocation("A", 2);

        Book b1 = new Book("111", "Clean Code", "Robert Martin", locA1);
        Book b2 = new Book("222", "Effective Java", "Joshua Bloch", locA1);
        Book b3 = new TextBook("333", "Algorithms", "Sedgewick", locA2, "Computer Science");

        Library library = new Library(new SearchByTitle());

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        System.out.println("=== Søgning efter titel: 'Clean Code' ===");
        System.out.println(library.search("Clean Code"));

        library.setSearchStrategy(new SearchByAuthor());

        System.out.println("\n=== Søgning efter author: 'Sedgewick' ===");
        System.out.println(library.search("Sedgewick"));

        System.out.println("\n=== Test for duplikat ISBN ===");
        try {
            library.addBook(new Book("111", "Another Book", "Someone Else", locA1));
        } catch (DuplicateBookException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("\n=== Test at TextBook ikke kan flyttes ===");
        try {
            b3.setLocation(locA1);     // Skal kaste exception
        } catch (UnsupportedOperationException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
