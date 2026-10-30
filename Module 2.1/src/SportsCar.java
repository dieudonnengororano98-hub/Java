public class SportsCar extends Car {

    public SportsCar(String typeName) {
        super(typeName);
    }

    public SportsCar(String typeName, double tankCapacity, double speed) {
        super(typeName, tankCapacity, speed);
    }

    @Override
    protected double getConsumption() {
        return 3;
    }

    @Override
    public void accelerate() {
        if (gasolineLevel > 0) {
            speed += 25;
            gasolineLevel = Math.max(0, gasolineLevel - getConsumption());
        } else
            speed = 0;
    }

    @Override
    void decelerate(int amount) {
        super.decelerate(amount * 2);
    }
}