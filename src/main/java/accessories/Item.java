package accessories;

import isellables.ISellable;

public class Item implements ISellable {

    private String type;
    private int buyingPrice;
    private int sellingPrice;

    public Item(String type, int buyingPrice, int sellingPrice){

        this.type = type;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getType() {
        return type;
    }

    public int getBuyingPrice() {
        return buyingPrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public int markUp() {
        return sellingPrice -= buyingPrice;
    }

}
