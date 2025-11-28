package exercise1;

import java.util.Objects;

public class BookLocation {
    private final String section;
    private final int shelf;

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
}
