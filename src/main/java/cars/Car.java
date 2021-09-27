package cars;

import beepers.Beeper;
import engines.Engine;
import gearBoxes.GearBox;

public abstract class Car {

    private GearBox gearBox;
    private Beeper beeper;
    private Engine engine;
    private String oil;

    public Car(GearBox gearBox, Beeper beeper, Engine engine, String oil){
        this.gearBox = gearBox;
        this.beeper = beeper;
        this.engine = engine;
        this.oil = oil;
    }

    public String checkBeep() {
        return beeper.makeSound();
    }
    public String checkSpeed() {
        return engine.makeRotation();
    }
    public void increasingEngineSpeed() { gearBox.changeGear(); }
    public String getOil() { return oil; }
}
