package buses;

import cars.Car;
import beepers.Beeper;
import engines.Engine;
import gearBoxes.GearBox;

public abstract class Bus extends Car implements PublicTransport {
    private int totalPeopleCount = 0;

    public Bus(GearBox gearBox, Beeper beeper, Engine engine, String oil) {
        super(gearBox, beeper, engine, oil);
    }

    @Override
    public void stop(int peopleCount) {
        totalPeopleCount += peopleCount;
        System.out.println("Остановка. Теперь в автобусе " + totalPeopleCount + " человек");
    }

    @Override
    public void doShiftChange() {
        System.out.println("Пересменка. Движение будет возобновлено через 3 минуты");
    }
}
