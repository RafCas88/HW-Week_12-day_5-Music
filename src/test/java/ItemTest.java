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
    }
}
