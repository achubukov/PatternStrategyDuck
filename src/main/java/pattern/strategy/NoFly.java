package pattern.strategy;

public class NoFly implements Flyable {

    public void fly() {
        System.out.println("I can't");
    }
}
