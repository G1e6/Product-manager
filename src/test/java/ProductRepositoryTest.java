import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductRepositoryTest {
    // Product products = new Product();
    //Smartphone smartphons = new Smartphone(products);


    Smartphone smartphone1 = new Smartphone(12, "Samsung", 12000, "Japan");
    Smartphone smartphone2 = new Smartphone(142, "Sony", 15000, "Japan");
    Smartphone smartphone3 = new Smartphone(72, "Nokia", 18000, "China");

    @Test
    public void test() {
        ProductRepository repo = new ProductRepository();
        repo.add(smartphone1);
        repo.add(smartphone2);
        repo.add(smartphone3);
        repo.remoteById(smartphone2.getId());

        Smartphone[] expected = {smartphone1, smartphone3};
        Product[] actual = repo.getProducts();

        Assertions.assertArrayEquals(expected, actual);

    }

}
