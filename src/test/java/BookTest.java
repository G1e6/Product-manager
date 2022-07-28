import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {

    @Test
    public void getAndSetBook() {
        Book book = new Book(12, "Золотая рыбка", 350, "Пушкин");

        book.setAuthor("Пушкин");

        String expected = ("Пушкин");
        String actual = book.getAuthor();

        Assertions.assertEquals(expected, actual);

    }
}
