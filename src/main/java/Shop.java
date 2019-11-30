import accessories.Item;

import java.util.ArrayList;

public class Shop {

    private ArrayList<Item> stock;


    public Shop(){
        stock = new ArrayList<Item>();

    }

    public int stockStartsEmpty(){
        return stock.size();
    }

    public void addItem(Item item){
      this.stock.add(item);
    }

    public void removeItem(Item item){
        this.stock.remove(item);
    }
}
