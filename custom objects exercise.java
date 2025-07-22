public class Book {
    String title, author, genre;

    public Book(String title, String author, String genre) {
        this.title = title; this.author = author; this.genre = genre;
    }

    @Override
    public String toString() {
        return title + " by " + author + " (" + genre + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book b)) return false;
        return title.equals(b.title) && author.equals(b.author);
    }

    @Override
    public int hashCode() {
        return title.hashCode() + author.hashCode();
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Book> books = List.of(
            new Book("1984", "George Orwell", "Dystopian"),
            new Book("THINGS FALL APART", "CHINUA ACHEBE", "Classic"),
            new Book("HALF A YELLOW SUN", "CHIMAMANDA ADICHIE", "Fantasy"),
            new Book("1984", "George Orwell", "Dystopian") // Duplicate
        );

        // Print list of books above.
        System.out.println("All books:");
        books.forEach(System.out::println);

        // Group by genre
        Map<String, List<Book>> byGenre = new HashMap<>();
        for (Book b : books)
            byGenre.computeIfAbsent(b.genre, g -> new ArrayList<>()).add(b);

        System.out.println("\nBooks by genre:");
        byGenre.forEach((g, list) -> {
            System.out.println(g + ":");
            list.forEach(b -> System.out.println("  " + b));
        });

        // Use set to remove duplicates
        Set<Book> uniqueBooks = new HashSet<>(books);
        System.out.println("\nUnique books:");
        uniqueBooks.forEach(System.out::println);
    }
}
