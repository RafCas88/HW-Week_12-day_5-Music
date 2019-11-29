package instruments;


import isellables.ISellable;

public class Guitar extends Instrument implements IPlayable, ISellable {

    private int strings;

    public Guitar(int strings, String material, String colour, String type){
        super(material, colour, type);
        this.strings = strings;

    }


    public String play() {
        return "I wanna rock 'n' rol all night....and party everyday";
    }

    public int getStrings() {
        return strings;
    }
}
