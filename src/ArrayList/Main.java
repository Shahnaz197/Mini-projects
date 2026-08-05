package ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

            ProductManager manager = new ProductManager();

            // adding products
            manager.addProduct("Apple");
            manager.addProduct("Avocado");
            manager.addProduct("Banana");
            manager.addProduct("Blueberry");
            manager.addProduct("Cherry");
            manager.addProduct("Apricot");


            // get all products
            ArrayList<String> allProducts = manager.getProducts();

            System.out.println("All products:");
            for (String product : allProducts) {
                System.out.println(product);
            }


            // filter products starting with A
            ArrayList<String> filteredProducts = manager.filterByLetter('A');

            System.out.println("\nProducts starting with A:");
            for (String product : filteredProducts) {
                System.out.println(product);
            }


            // count filtered products
            int count = manager.getProductCount(filteredProducts);

            System.out.println("\nNumber of A products: " + count);
    }
}
