import java.util.ArrayList;
import java.util.HashMap;

public class GroceryListManager{
    public static void main(String[] args){
        GroceryListManager groceryListManager = new GroceryListManager();

        groceryListManager.addItem("Milk", 2.50, "Dairy");
        groceryListManager.addItem("Apple", 1.20, "Fruits");
        groceryListManager.addItem("Bread", 3.00, "Bakery");



        System.out.println("grocery List: ");
        groceryListManager.displayList();
        System.out.println("Is Milk on the list? " + groceryListManager.checkItem("Milk"));
        System.out.println("Is Eggs on the list? " + groceryListManager.checkItem("Eggs"));
        groceryListManager.removeItem("Apple");
        System.out.println("Updated Grocery List:");
        groceryListManager.displayList();
        System.out.println("Total cost: " + groceryListManager.calculateTotalCost());

        groceryListManager.addItem("Cheese", 4.00, "Dairy");
        groceryListManager.addItem("Banana", 1.10, "Fruits");
        groceryListManager.addItem("Yogurt", 1.80, "Dairy");
        System.out.println("Dairy items:");
        groceryListManager.displayByCategory("Dairy");





    }
    private HashMap<String, Double> groceryList = new HashMap<>();
    private HashMap<String, String> categories = new HashMap<>();


    public void addItem(String item, double cost,String category) {
        groceryList.put(item, cost);
        categories.put(item, category);
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

    public void displayByCategory(String category) {
        for (String item : categories.keySet()) {
            if (categories.get(item).equals(category)) {
                System.out.println(item);
            }
        }
    }

}