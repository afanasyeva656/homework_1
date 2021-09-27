package trucks;

import beepers.Beeper;
import cars.Car;
import engines.Engine;
import gearBoxes.GearBox;

public abstract class Truck extends Car {
    private String maker;
    private double loadCapacity;
    private CargoDelivery cargoDelivery;

    public Truck(GearBox gearBox, String maker, double loadCapacity, Beeper beeper, Engine engine, CargoDelivery cargoDelivery,
                 String oil) {
        super(gearBox, beeper, engine, oil);
        this.maker = maker;
        this.loadCapacity = loadCapacity;
        this.cargoDelivery = cargoDelivery;
    }

    public String getCargo(double weightOfCargo) {return cargoDelivery.loading(weightOfCargo);}
    public String transferCargo() {return cargoDelivery.transferCargo();}
    public String uploading(double weightOfCargo) {return cargoDelivery.uploading(weightOfCargo);}
    public double getLoadCapacity() {return loadCapacity;}
    public String getMaker() {return maker;}
}
