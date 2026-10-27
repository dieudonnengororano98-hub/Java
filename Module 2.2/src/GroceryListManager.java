import java.util.HashMap;

public class GroceryListManager {

    public static void main(String[] args) {
        GroceryListManager groceryListManager = new GroceryListManager();

        groceryListManager.addItem("Milk", 2.50, "Dairy", 2);
        groceryListManager.addItem("Apple", 1.20, "Fruits", 5);
        groceryListManager.addItem("Bread", 3.00, "Bakery", 1);
        groceryListManager.addItem("Cheese", 4.00, "Dairy", 0);

        System.out.println("Grocery List:");
        groceryListManager.displayList();

        System.out.println("Is Milk on the list? " + groceryListManager.checkItem("Milk"));
        System.out.println("Is Eggs on the list? " + groceryListManager.checkItem("Eggs"));

        System.out.println("Dairy items:");
        groceryListManager.displayByCategory("Dairy");

        System.out.println("Available items:");
        groceryListManager.displayAvailableItems();

        groceryListManager.updateQuantity("Cheese", 3);
        System.out.println("Available items after updating Cheese:");
        groceryListManager.displayAvailableItems();

        groceryListManager.removeItem("Apple");
        System.out.println("Updated Grocery List:");
        groceryListManager.displayList();

        System.out.println("Total cost: " + groceryListManager.calculateTotalCost());
    }

    private HashMap<String, Double> groceryList = new HashMap<>();

    private HashMap<String, String> categories = new HashMap<>();

    private HashMap<String, Integer> quantities = new HashMap<>();

    public void addItem(String item, double cost) {
        groceryList.put(item, cost);
        quantities.put(item, 1);
    }

    public void addItem(String item, double cost, String category) {
        groceryList.put(item, cost);
        categories.put(item, category);
        quantities.put(item, 1);
    }

    public void addItem(String item, double cost, String category, int quantity) {
        groceryList.put(item, cost);
        categories.put(item, category);
        quantities.put(item, quantity);
    }

    public void removeItem(String item) {
        groceryList.remove(item);
        categories.remove(item);
        quantities.remove(item);
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
        for (String item : groceryList.keySet()) {
            total += groceryList.get(item) * quantities.get(item);
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

    public void updateQuantity(String item, int newQuantity) {
        if (quantities.containsKey(item)) {
            quantities.put(item, newQuantity);
        } else {
            System.out.println(item + " is not on the list.");
        }
    }

    public void displayAvailableItems() {
        for (String item : quantities.keySet()) {
            if (quantities.get(item) > 0) {
                System.out.println(item + " - quantity: " + quantities.get(item));
            }
        }
    }
}