import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmartfoneTest {

    @Test
    public void getAndSetSmartphone() {
        Smartphone smartphone = new Smartphone(45, "Sony", 12000, "Chane");

        smartphone.setManufacturer("Chane");

        String expected = ("Chane");
        String actual = smartphone.getManufacturer();

        Assertions.assertEquals(expected, actual);

    }

}
