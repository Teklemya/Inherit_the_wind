import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product p1, p2, p3, p4;
    @BeforeEach
    void setUp() {
        p1 = new Product("00000A", "Mos", "this is nai asisa", 54.43);
        p2 = new Product("00000B", "sldnllsd", "sdc dsc", 33.30);
        p3 = new Product("00000C", "asnosan", "sdc yree", 73.30);
        p4 = new Product("00000D", "asxsca", "dsc nhh", 93.30);
    }

    @Test
    void setID() {
        p1.setID("00000A");
        assertEquals("00000A", p1.getID());
    }

    @Test
    void setName() {
        p1.setName("noway");
        assertEquals("noway", p1.getName());
    }

    @Test
    void setDescription() {
        p1.setDescription("this is fun");
        assertEquals("this is fun", p1.getDescription());
    }

    @Test
    void setCost() {
        p1.setCost(23.32);
        assertEquals(23.32, p1.getCost());
    }

    @Test
    void productInfo() {
    p1.setID("00000A");
    p1.setName("plant");
    p1.setDescription("life");
    p1.setCost(20.00);
    assertEquals("00000A, plant is described as life it costs $20.0" , p1.productInfo());
    }

    @Test
    void toCSVDataRecord() {
        p1.setID("00000A");
        p1.setName("plant");
        p1.setDescription("life");
        p1.setCost(20.00);
        assertEquals("00000A, plant, life, 20.0", p1.toCSVDataRecord());
    }
}