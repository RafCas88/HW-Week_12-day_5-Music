package instruments;

import isellables.ISellable;

public class Piano extends Instrument implements IPlayable {

    private int keys;

    public Piano(int keys, String material, String colour, String type, int buyingPrice, int sellingPrice){

        super(material, colour, type, buyingPrice, sellingPrice);
        this.keys = keys;

    }


    public String play() {
        return "Softly, in the dusk, a woman is singing to me;";
    }

    public int getKeys() {
        return keys;
    }
}
