import accessories.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    Item item1;
    Item item2;
    Item item3;

    @Before
    public void before(){

        item1 = new Item("guitar strings", 5, 10);
        item2 = new Item("drum sticks", 8, 16);
        item3 = new Item("sheet music", 3, 6);

    }

    @Test
    public void hasType(){
        assertEquals("guitar strings", item1.getType());
        assertEquals("drum sticks", item2.getType());
        assertEquals("sheet music", item3.getType());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(5, item1.getBuyingPrice());
        assertEquals(8, item2.getBuyingPrice());
        assertEquals(3, item3.getBuyingPrice());
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(10, item1.getSellingPrice());
        assertEquals(16, item2.getSellingPrice());
        assertEquals(6, item3.getSellingPrice());
    }

    @Test
    public void hasMarkUp(){
        assertEquals(5, item1.markUp());
        assertEquals(8, item2.markUp());
        assertEquals(3, item3.markUp());
    }
}
