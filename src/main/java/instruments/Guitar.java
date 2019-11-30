package instruments;




public class Guitar extends Instrument implements IPlayable {

    private int strings;

    public Guitar(int strings, String material, String colour, String type, int buyingPrice, int sellingPrice){
        super(material, colour, type, buyingPrice, sellingPrice);
        this.strings = strings;

    }


    public String play() {
        return "I wanna rock 'n' rol all night....and party everyday";
    }

    public int getStrings() {
        return strings;
    }
}
