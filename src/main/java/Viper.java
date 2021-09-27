import beepers.Beeper;
import cars.Car;
import engines.Engine;
import gearBoxes.GearBox;

public class Viper extends Car {


    public Viper(GearBox gearBox, Beeper beeper, Engine engine, String oil) {
        super(gearBox, beeper, engine, oil);
    }

    public void scoopFuel() {
        System.out.println("Fuel scooped");
    }

    public void landToPlanet() {
        System.out.println("Vehicle landed");
    }
}
