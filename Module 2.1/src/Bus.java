public class Bus extends Car {
    private int passengers;
    private int capacity;

    public Bus(String typeName, int capacity) {
        super(typeName);
        this.capacity = capacity;
        this.passengers = 0;
    }

    public boolean passengerEnter() {
        if (passengers < capacity) {
            passengers++;
            return true;
        }
        return false;
    }

    public boolean passengerExit() {
        if (passengers > 0) {
            passengers--;
            return true;
        }
        return false;
    }
    

    public int getPassengers() {
        return passengers;
    }
}
