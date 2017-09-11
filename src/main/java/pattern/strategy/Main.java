package pattern.strategy;

public class Main {
    public static void main(String[] args) {
        DuckAlive duck = new DuckAlive();
        ToyDuck toyDuck = new ToyDuck();
        duck.fly();
        toyDuck.fly();
    }
}
