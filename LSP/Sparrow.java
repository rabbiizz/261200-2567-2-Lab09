package LSP;

public class Sparrow implements Flyable {
    @Override
    public void move() {
        System.out.println("Sparrow move");
    }
    @Override
    public void fly() {
        System.out.println("Sparrow fly");
    }
}