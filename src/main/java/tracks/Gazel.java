package tracks;

import beepers.Beeper;
import engines.Engine;
import gearBoxes.GearBox;


public class Gazel extends Track {

    public Gazel(GearBox gearBox, String maker, double loadCapacity, Beeper beeper, Engine engine, CargoDelivery cargoDelivery, String oil) {
        super(gearBox, maker, loadCapacity, beeper, engine, cargoDelivery, oil);
    }
}
