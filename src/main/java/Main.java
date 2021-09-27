import beepers.Beeper;
import beepers.FancyMusic;
import beepers.Horn;
import beepers.MagicSpark;
import buses.Bus22;
import cars.Audi;
import cars.Lambo;
import cars.Tesla;
import engines.ElectroEngine;
import engines.Engine12V;
import engines.FSDEngine;
import gearBoxes.AutoGearBox;
import gearBoxes.ManualGearBox;
import trucks.BestDelivery;
import trucks.Gazel;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Beepers
        Beeper music = new FancyMusic();
        Beeper magic = new MagicSpark();
        Beeper horn = new Horn();

        // Engines
        Engine12V engine12V = new Engine12V();
        FSDEngine fsdEngine = new FSDEngine();
        ElectroEngine electroEngine = new ElectroEngine();

        // Gear Boxes
        ManualGearBox manualGearBox = new ManualGearBox();
        AutoGearBox autoGearBox = new AutoGearBox();

        // Cars
        Lambo lambo = new Lambo(autoGearBox, magic, fsdEngine, "petrol");
        Audi audi = new Audi(manualGearBox, music, engine12V, "patrol");
        Tesla tesla = new Tesla(autoGearBox, magic, electroEngine, "electricity");

        System.out.println("<-- Реализация Cars -->");
        System.out.println(lambo.checkBeep());
        System.out.println("Топливо для Ауди: " + audi.getOil());
        tesla.increasingEngineSpeed();

        System.out.println("<-- Реализация buses.Bus -->");
        Bus22 bus22 = new Bus22(manualGearBox, music, engine12V, "disel");
        ArrayList<String> bus22Rote = new ArrayList<>();
        bus22Rote.add("Площадь победы");
        bus22Rote.add("Центральный вокзал");
        bus22Rote.add("Рынок");

        bus22.setRote(bus22Rote);

        System.out.println("Автобус 22 следует маршруту: ");
        for (int i = 0; i < bus22.getRote().size(); i++) {
            System.out.println(bus22.getRote().get(i));
        }

        bus22.stop(25);
        bus22.stop(-8);
        bus22.stop(-17);
        bus22.doShiftChange();

        System.out.println("<-- Реализация tracks.Gazel -->");
        BestDelivery bestDelivery = new BestDelivery();
        Gazel gazel = new Gazel(manualGearBox,"ГАЗ", 0.5, horn, engine12V, bestDelivery, "disel");
        System.out.println("Грузоподъемность: " + gazel.getLoadCapacity() + " т");
        System.out.println(gazel.getCargo(0.1));
        System.out.println(gazel.transferCargo());
        System.out.println(gazel.uploading(0.05));

    }
}
