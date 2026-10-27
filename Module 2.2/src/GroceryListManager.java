import java.util.ArrayList;

public class GroceryListManager{
    public static void main(String[] args){
        GroceryListManager groceryListManager = new GroceryListManager();

        groceryListManager.addItem("Milk");
        groceryListManager.addItem("Apple");
        groceryListManager.addItem("Bread");
        System.out.println("grocery List: ");
        groceryListManager.displayList();
        System.out.println("Is Milk on the list? " + groceryListManager.checkItem("Milk"));
        System.out.println("Is Eggs on the list? " + groceryListManager.checkItem("Eggs"));
        groceryListManager.removeItem("Apple");
        System.out.println("Updated Grocery List:");
        groceryListManager.displayList();




    }
    private ArrayList<String> groceryList = new ArrayList<>();


    public void addItem(String item){
        groceryList.add(item);

    }
    public void removeItem(String item){
        groceryList.remove(item);


    }
    public void displayList(){
        for(String item : groceryList){
            System.out.println(item);
        }
    }

    public boolean checkItem(String item){
        return groceryList.contains(item);

    }





}