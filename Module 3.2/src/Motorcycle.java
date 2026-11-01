public class Motorcycle extends AbstractVehicle {

    private String color;

    public Motorcycle(String color) {
        super("Motorcycle", "Gasoline", 0.05);
        this.color = color; 
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n" +
                "Color: " + color;
    }
}
