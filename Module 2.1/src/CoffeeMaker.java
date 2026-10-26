public class CoffeeMaker {
    private boolean on;
    private String coffeeType = "normal";
    private int coffeeAmount;

    public CoffeeMaker() {
        on = false;
        coffeeAmount = 10;
    }

    public boolean isOn() {
        return on;
    }

    public void pressOnOff() {
        on = !on;
    }

    public int getCoffeeAmount() {
        return coffeeAmount;
    }

    public void setCoffeeAmount(int newCoffeeAmount) {
        if (on) {
            if (newCoffeeAmount >= 10 && newCoffeeAmount <= 80) {
                coffeeAmount = newCoffeeAmount;
            }
        }
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(String newType) {
        if (on) {
            if (newType.equals("normal") || newType.equals("espresso")) {
                coffeeType = newType;
            }
        }
    }
}