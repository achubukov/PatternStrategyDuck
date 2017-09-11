package pattern.strategy;

public class ToyDuck extends Duck{
    public ToyDuck() {
        setFlyable(new NoFly());
    }
}
