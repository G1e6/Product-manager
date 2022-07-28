import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductManagerTest {
    ProductRepository repository = new ProductRepository();
    ProductManager manager = new ProductManager(repository);


    Book book1 = new Book(1, "Turnip ", 300, "Pero");
    Book book2 = new Book(12, "Moon and Sun", 350, "Petya");
    Book book3 = new Book(18, "Sun", 400, "Vasya");

    Smartphone smartphone1 = new Smartphone(2, "Samsung", 12000, "Japan");
    Smartphone smartphone2 = new Smartphone(25, "Sony", 22000, "China");
    Smartphone smartphone3 = new Smartphone(45, "Sony", 32000, "China");

    @Test
    public void nothingFound() {
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] actual = manager.searchBy("Oleg");
        Product[] expected = {};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void foundAll() {
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] actual = manager.searchBy("Sun");
        Product[] expected = {book2, book3};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void foundOne() {
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] actual = manager.searchBy("Turnip");
        Product[] expected = {book1};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void nothingFound1() {
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        Product[] actual = manager.searchBy("iPhon");
        Product[] expected = {};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void foundAll1() {
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);


        Product[] actual = manager.searchBy("Sony");
        Product[] expected = {smartphone2, smartphone3};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void foundOne1() {
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        Product[] actual = manager.searchBy("Samsung");
        Product[] expected = {smartphone1};

        Assertions.assertArrayEquals(expected, actual);

    }


}
