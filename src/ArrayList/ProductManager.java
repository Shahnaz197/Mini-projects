package ArrayList;

import java.util.ArrayList;

public class ProductManager {

    //so only productmanager can accesss
    private ArrayList<String> products =new ArrayList<>();

    public void addProduct(String names){
        products.add(names);
    }
    public ArrayList<String> getProducts(){
        return products;
    }
    public ArrayList<String> filterByLetter(char letter){
        ArrayList<String> filtered = new ArrayList<>();
            for (String product :products){
                if(product.startsWith(String.valueOf(letter))) {
                    filtered.add(product);
                }
            }
            return filtered;
    }
    public int getProductCount(ArrayList<String> list ){
        return list.size();

    }
}
