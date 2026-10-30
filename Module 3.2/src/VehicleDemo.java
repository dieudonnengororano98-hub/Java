public class VehicleDemo {

    public static void main(String[] args) {
        System.out.println("Vehicle Demonstration");
        System.out.println();

        showVehicle("Car", new Car("Red"), "miles per gallon");
        showVehicle("Motorcycle", new Motorcycle("Black"), "liters per km");
        showVehicle("Bus", new Bus(40), "liters per km");
        showVehicle("Electric Car", new ElectricCar("White"), "kWh per km");
        showVehicle("Electric Motorcycle", new ElectricMotorcycle("Green"), "kWh per km");
    }

    private static void showVehicle(String name, AbstractVehicle vehicle, String unit) {
        vehicle.start();
        vehicle.stop();
        vehicle.charge();
        System.out.println(name + " Information:");
        System.out.println(vehicle.getInfo());
        System.out.println("Fuel efficiency: " + vehicle.calculateFuelEfficiency() + " " + unit);
        System.out.println();
    }
}