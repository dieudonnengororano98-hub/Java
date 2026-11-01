public class ElectricMotorcycle extends AbstractVehicle {

    private String color;

    public ElectricMotorcycle(String color) {
        super("Electric Motorcycle", "Electricity", 0.07);
        this.color = color;
    }

    @Override
    public void charge() {
        System.out.println("Electric Motorcycle is charging...");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n" +
                "Color: " + color;
    }
} 
