import java.util.ArrayList;
import java.util.HashMap;

public class GroceryListManager{
    public static void main(String[] args){
        GroceryListManager groceryListManager = new GroceryListManager();

        groceryListManager.addItem("Milk", 2.50);
        groceryListManager.addItem("Apple", 1.20);
        groceryListManager.addItem("Bread", 3.00);
        System.out.println("grocery List: ");
        groceryListManager.displayList();
        System.out.println("Is Milk on the list? " + groceryListManager.checkItem("Milk"));
        System.out.println("Is Eggs on the list? " + groceryListManager.checkItem("Eggs"));
        groceryListManager.removeItem("Apple");
        System.out.println("Updated Grocery List:");
        groceryListManager.displayList();
        System.out.println("Total cost: " + groceryListManager.calculateTotalCost());




    }
    private HashMap<String, Double> groceryList = new HashMap<>();


    public void addItem(String item, double cost){
        groceryList.put(item, cost);

    }
    public void removeItem(String item){
        groceryList.remove(item);


    }
    public void displayList(){
        for(String item : groceryList.keySet()){
            System.out.println(item);
        }
    }

    public boolean checkItem(String item) {
        return groceryList.containsKey(item);

    }

    public double calculateTotalCost() {
        double total = 0;
        for (double cost : groceryList.values()) {
            total += cost;
        }
        return total;
    }

}