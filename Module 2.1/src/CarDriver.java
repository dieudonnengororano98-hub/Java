public class CarDriver {
    public static void main(String[] args){
        Car myCar;

        myCar = new Car("Toyota Corolla");
        myCar.fillTank();

        for (int i = 0; i < 6; i++){
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is" + myCar.getSpeed() + "km/h");
        }

        while (myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is" + myCar.getSpeed() + "km/h");
        }

        Car truck = new Car("Volvo FH", 600, 20);
        truck.fillTank();
        System.out.println(truck.getGasolineLevel());
        System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");


    }

}
