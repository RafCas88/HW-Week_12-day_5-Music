import isellables.ISellable;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISellable> stock;

    public Shop(){
        stock = new ArrayList<ISellable>();
    }

    public int stockStartsEmpty(){
        return stock.size();
    }

    public void addItem(ISellable isellable){
       this.stock.add(isellable);
    }

    public void removeItem(ISellable iSellable){
        this.stock.remove(iSellable);
    }

}
