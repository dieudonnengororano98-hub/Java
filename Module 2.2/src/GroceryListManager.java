import java.util.HashMap;

public class GroceryListManager {

    public static void main(String[] args) {
        GroceryListManager groceryListManager = new GroceryListManager();

        groceryListManager.addItem("Milk", 2.50, "Dairy");
        groceryListManager.addItem("Apple", 1.20, "Fruits");
        groceryListManager.addItem("Bread", 3.00, "Bakery");
        groceryListManager.addItem("Cheese", 4.00, "Dairy");

        System.out.println("Grocery List:");
        groceryListManager.displayList();

        System.out.println("Is Milk on the list? " + groceryListManager.checkItem("Milk"));
        System.out.println("Is Eggs on the list? " + groceryListManager.checkItem("Eggs"));
        System.out.println("Dairy items:");
        groceryListManager.displayByCategory("Dairy");
        groceryListManager.removeItem("Apple");
        System.out.println("Updated Grocery List:");
        groceryListManager.displayList();

        System.out.println("Total cost: " + groceryListManager.calculateTotalCost());
    }

    private HashMap<String, Double> groceryList = new HashMap<>();
    private HashMap<String, String> categories = new HashMap<>();
    public void addItem(String item, double cost) {
        groceryList.put(item, cost);
    }
    public void addItem(String item, double cost, String category) {
        groceryList.put(item, cost);
        categories.put(item, category);
    }
    public void removeItem(String item) {
        groceryList.remove(item);
        categories.remove(item);
    }

    public void displayList() {
        for (String item : groceryList.keySet()) {
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