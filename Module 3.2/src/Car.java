public class Car extends AbstractVehicle {

    private String color;

    public Car(String color) {
        super("Car", "Petrol", 30.0);
        this.color = color;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n" +
                "Color: " + color;
    }
}