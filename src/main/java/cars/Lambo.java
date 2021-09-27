package cars;

import beepers.Beeper;
import engines.Engine;
import gearBoxes.GearBox;

public class Lambo extends Car {
    public Lambo(GearBox gearBox, Beeper beeper, Engine engine, String oil) {
        super(gearBox, beeper, engine, oil);
    }

}
