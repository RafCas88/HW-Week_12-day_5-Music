package instruments;

import isellables.ISellable;

public class Trumpet extends Instrument implements IPlayable, ISellable {

    private int valves;

    public Trumpet(int valves, String material, String colour, String type){

        super(type, material, colour);

        this.valves = valves;

    }

    public String play() {
        return "Freezer lyrics";
    }

    public int getValves() {
        return valves;
    }
}
