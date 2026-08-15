package ArrayList;

import java.util.ArrayList;

public class ShoppingCart {

    ArrayList<String>items = new ArrayList<>();

    public void addItems(String item){
        items.add(item);
    }
    public void removeItems(String item){
        items.remove(item);
    }
    public void showItems(){
        for (String i : items){
            System.out.println(i);
        }
    }
    public int totalItems(){
        return items.size();
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItems("apple");
        cart.addItems("orange");
        cart.addItems("water");
        cart.addItems("bread");

        cart.removeItems("orange");
        cart.showItems();
        System.out.println("Total  " + cart.totalItems());



    }

}
