package pattern.strategy;

public class DuckAlive extends Duck {
    public DuckAlive() {
        setFlyable(new Fly());
    }
}
