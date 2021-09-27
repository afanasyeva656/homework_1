package buses;

import beepers.Beeper;
import engines.Engine;
import gearBoxes.GearBox;

import java.util.ArrayList;

public class Bus22 extends Bus {
    private ArrayList<String> rote = new ArrayList<>();

    public Bus22(GearBox gearBox, Beeper beeper, Engine engine, String oil) {
        super(gearBox, beeper, engine, oil);
    }


    public ArrayList<String> getRote() {
        return rote;
    }

    public void setRote(ArrayList<String> rote) {
        this.rote = rote;
    }
}
