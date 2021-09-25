package beepers;

public class FancyMusic implements Beeper{
    @Override
    public String makeSound() {
        return "What is Love? Baby don't hurt me";
    }

    public String checkArtist() {
        return "Various Artist";
    }
}
