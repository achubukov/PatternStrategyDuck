package pattern.strategy;

public abstract class Duck {

    private Flyable flyable;

    public void fly(){
        flyable.fly();
    }

    public void setFlyable(Flyable flyable){
        this.flyable = flyable;
    }
}
