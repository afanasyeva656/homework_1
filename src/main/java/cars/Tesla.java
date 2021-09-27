package cars;

import beepers.Beeper;
import engines.Engine;
import gearBoxes.GearBox;

public class Tesla extends Car{
    public Tesla(GearBox gearBox, Beeper beeper, Engine engine, String oil) {
        super(gearBox, beeper, engine, oil);
    }
}
