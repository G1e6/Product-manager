import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {



    @Test
    public void getProduct() {
        Product product = new Product(12, "Книга", 450);



        Assertions.assertEquals(12, product.getId());
        Assertions.assertEquals("Книга", product.getName());
        Assertions.assertEquals(450, product.getPrice());

    }

    @Test
    public void idProduct(){
        Product product = new Product(12, "Книга", 450);
        product.setId(12);

        int expected = 12;
        int actual = product.getId();

        Assertions.assertEquals(expected,actual);


    }

    @Test
    public void nameProduct(){
        Product product = new Product(12, "Книга", 450);
        product.setName("Книга");

        String expected = ("Книга");
        String actual = product.getName();

        Assertions.assertEquals(expected,actual);


    }

    @Test
    public void priceProduct(){
        Product product = new Product(12, "Книга", 450);
        product.setPrice(450);

        int expected = 450;
        int actual = product.getPrice();

        Assertions.assertEquals(expected,actual);


    }


}
