package gearBoxes;

public class AutoGearBox implements GearBox {
    @Override
    public void changeGear() {
        System.out.println("Автоматическое изменение передачи");
    }
}
