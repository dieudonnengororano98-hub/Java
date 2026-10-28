import java.util.HashMap;

public class GroceryListManager {

    public static void main(String[] args) {
        testTotalCost();
        testCategories();
        testQuantityTracking();
    }

    public static void testTotalCost() {
        System.out.println("Test Total Cost");
        GroceryListManager manager = new GroceryListManager();

        manager.addItem("Milk", 2.50, "Dairy", 2);
        manager.addItem("Bread", 3.00, "Bakery", 1);
        manager.addItem("Eggs", 0.50, "Dairy", 12);

        System.out.println("Items:");
        manager.displayList();
        System.out.println("Total cost: " + manager.calculateTotalCost());
        System.out.println();
    }

    public static void testCategories() {
        System.out.println("Test: Categories");
        GroceryListManager manager = new GroceryListManager();

        manager.addItem("Milk", 2.50, "Dairy", 2);
        manager.addItem("Cheese", 4.00, "Dairy", 1);
        manager.addItem("Apple", 1.20, "Fruits", 5);
        manager.addItem("Banana", 1.10, "Fruits", 6);
        manager.addItem("Bread", 3.00, "Bakery", 1);

        System.out.println("Dairy items:");
        manager.displayByCategory("Dairy");
        System.out.println("Fruits items:");
        manager.displayByCategory("Fruits");
        System.out.println("Bakery items:");
        manager.displayByCategory("Bakery");
        System.out.println();
    }

    public static void testQuantityTracking() {
        System.out.println("Test: Quantity Tracking");
        GroceryListManager manager = new GroceryListManager();

        manager.addItem("Milk", 2.50, "Dairy", 2);
        manager.addItem("Apple", 1.20, "Fruits", 5);
        manager.addItem("Cheese", 4.00, "Dairy", 0);

        System.out.println("Available items (Cheese has quantity 0):");
        manager.displayAvailableItems();

        manager.updateQuantity("Cheese", 3);
        manager.updateQuantity("Milk", 0);

        System.out.println("Available items after updates (Cheese = 3, Milk = 0):");
        manager.displayAvailableItems();

        manager.updateQuantity("Eggs", 4);
        System.out.println();
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