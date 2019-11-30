import accessories.Item;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class ShopTest {



    Shop shop;
    Item item;

    @Before
    public void before(){
        shop = new Shop();
        item = new Item("guitar", 5, 10);



    }

    @Test
    public void stockIsEmpty(){
        assertEquals(0, shop.stockStartsEmpty());
    }

    @Test
    public void canAddItem(){
        shop.addItem(item);
        assertEquals(1, shop.stockStartsEmpty());

    }

    @Test
    public void canRemoveItem(){
        shop.addItem(item);
        shop.removeItem(item);
        assertEquals(0, shop.stockStartsEmpty());
    }
}
