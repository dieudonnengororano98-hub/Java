public class CoffeeMakerDriver {
    public static void main(String [] args){
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        coffeeMaker.pressOnOff();
        if(coffeeMaker. isOn())
            System.out.println("CoffeeMaker is on");

        coffeeMaker.setCoffeeType("normal");
        coffeeMaker.setCoffeeAmount(50);
        System.out.println("Coffee amount is" +  "Ml");
        System.out.println("Coffee maker is off");

        coffeeMaker.pressOnOff();
        if(!coffeeMaker. isOn());
        System.out.println("Coffee maker is off");


    }





    }

