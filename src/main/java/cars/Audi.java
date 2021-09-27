package cars;

import beepers.Beeper;
import engines.Engine;
import gearBoxes.GearBox;

public class Audi extends Car{
    public Audi(GearBox gearBox, Beeper beeper, Engine engine, String oil) {
        super(gearBox, beeper, engine, oil);
    }
}
