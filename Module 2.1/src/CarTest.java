public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("Sedan");
        SportsCar sports = new SportsCar("Ferrari");
        Bus bus = new Bus("City bus", 2);

        car.fillTank();
        sports.fillTank();

        for (int i = 0; i < 3; i++) {
            car.accelerate();
            sports.accelerate();
        }
        System.out.println(car.getTypeName() + " speed: " + car.getSpeed()
                + ", fuel: " + car.getGasolineLevel());
        System.out.println(sports.getTypeName() + " speed: " + sports.getSpeed()
                + ", fuel: " + sports.getGasolineLevel());

        car.decelerate(10);
        sports.decelerate(10);
        System.out.println("After braking: " + car.getSpeed() + " vs " + sports.getSpeed());

        System.out.println(bus.passengerEnter());
        System.out.println(bus.passengerEnter());
        System.out.println(bus.passengerEnter());
        bus.passengerExit();
        System.out.println("Passengers: " + bus.getPassengers());
    }
}