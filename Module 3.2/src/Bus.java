public class Bus extends AbstractVehicle {

    private int capacity;

    public Bus(int capacity) {
        super("Bus", "Diesel", 0.35);
        this.capacity = capacity;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n" +
                "Capacity: " + capacity + " passengers";
    }
}