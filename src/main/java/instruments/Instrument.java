package instruments;
import isellables.ISellable;

public abstract class Instrument implements ISellable, IPlayable {

    private String material;
    private String colour;
    private String type;
    private int buyingPrice;
    private int sellingPrice;


    public Instrument(String material, String colour, String type, int buyingPrice, int sellingPrice){

        this.material = material;
        this.colour = colour;
        this.type = type;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
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

    public int markUp(){
        return sellingPrice -= buyingPrice;
    }
}
