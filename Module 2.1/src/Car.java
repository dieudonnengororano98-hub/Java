public class Car {

    protected double speed;
    protected double gasolineLevel;
    private String typeName;
    protected double tankCapacity;

    public Car(String typeName) {
        speed = 0;
        gasolineLevel = 0;
        tankCapacity = 100;
        this.typeName = typeName;
    }

    public Car(String typeName, double tankCapacity, double speed) {
        this.typeName = typeName;
        this.tankCapacity = tankCapacity;
        this.speed = speed;
        this.gasolineLevel = 0;
    }

    protected double getConsumption() {
        return 1;
    }

    public void accelerate() {
        if (gasolineLevel > 0) {
            speed += 10;
            gasolineLevel = Math.max(0, gasolineLevel - getConsumption());
        } else
            speed = 0;
    }

    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else {
            speed = 0;
        }
    }

    double getSpeed() {
        return speed;
    }

    String getTypeName() {
        return typeName;
    }

    void fillTank() {
        gasolineLevel = tankCapacity;
    }

    double getGasolineLevel() {
        return gasolineLevel;
    }
}