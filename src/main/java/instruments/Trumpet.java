package instruments;

import isellables.ISellable;

public class Trumpet extends Instrument implements IPlayable {

    private int valves;

    public Trumpet(int valves, String material, String colour, String type){

        super(material, colour, type);

        this.valves = valves;

    }

    public String play() {
        return "Freezer lyrics";
    }

    public int getValves() {
        return valves;
    }
}
