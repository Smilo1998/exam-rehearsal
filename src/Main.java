import exercise1.Book;
import exercise1.BookLocation;
import exercise2.TextBook;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Lav en BookLocation
        BookLocation location1 = new BookLocation("A", 3);
        BookLocation location2 = new BookLocation("B", 1);

        // Lav en normal Book
        Book book = new Book("12345", "Clean Code", "Robert C. Martin", location1);

        // Lav en TextBook
        TextBook textBook = new TextBook(
                "98765",
                "Advanced Mathematics",
                "John Doe",
                location2,
                "Mathematics"
        );

        System.out.println("Normal Book:");
        System.out.println(book);

        System.out.println("\nTextBook:");
        System.out.println(textBook);

        // Test: Book må gerne flyttes
        System.out.println("\nFlytter normal bog...");
        book.setLocation(location2);
        System.out.println(book);

        // Test: TextBook må IKKE flyttes
        System.out.println("\nPrøver at flytte TextBook...");
        try {
            textBook.setLocation(location1);
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println(textBook);
    }
}