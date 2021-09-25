import beepers.Beeper;
import beepers.FancyMusic;
import beepers.Horn;
import beepers.MagicSpark;
import engines.Engine12V;
import engines.FSDEngine;

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

        Lambo lambo = new Lambo(magic, fsdEngine);
        Viper viper = new Viper(music, fsdEngine);

        viper.scoopFuel();
        viper.landToPlanet();

        System.out.println(viper.checkBeep());
        System.out.println(viper.checkSpeed());

        ArrayList<Car> carList = new ArrayList<Car>();
        carList.add(viper);
        carList.add(lambo);
        for (int i = 0; i < carList.size(); i++) {
            System.out.println(carList.get(i).checkBeep());
        }
    }
}
