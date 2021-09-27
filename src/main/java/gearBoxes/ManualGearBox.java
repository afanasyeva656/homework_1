package gearBoxes;

public class ManualGearBox implements GearBox{
    @Override
    public void changeGear() {
        System.out.println("Водитель сменил передачу");
    }
}
