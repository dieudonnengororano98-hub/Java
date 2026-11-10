public class ElectricCar extends AbstractVehicle {

    private String color; 

    public ElectricCar(String color) {
        super("Electric Car", "Electricity", 0.15);
        this.color = color;
    }

    @Override
    public void charge() {
        System.out.println("Electric Car is charging...");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n" +
                "Color: " + color;
    }
}
