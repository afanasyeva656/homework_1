package trucks;

public class BestDelivery implements CargoDelivery {
    @Override
    public String loading(double weight) {
        return "Так, вес груза - " + weight + " т. Ну, с Богом!";
    }

    @Override
    public String transferCargo() {
        return "Сань, смотри, что там на мосту написано? Газель не проедет? Пфффф";
    }

    @Override
    public String uploading(double weight) {
        int boxesAfter = (int) (weight * 100);

        return "Ой, да ладно, ну потеряли мы " + (boxesAfter) + " коробок, с кем не бывает";
    }
}
