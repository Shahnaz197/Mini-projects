public class Shop {

    public double discount;

    public Product createProduct(String name,double price){
        return new Product(name, price);

    }

    public void sellProduct(Product product){
        System.out.println("Sold : " + product.name);
    }

    public void applyDiscountPrice(Product product,double discount){
        double newPrice = product.getPrice()-discount ;
        product.setPrice(newPrice);
        System.out.println("New price: " + product.getPrice());

    }

    public Product getMostExpensive(Product p1,Product p2){
        if(p1.getPrice() > p2.getPrice()){
            return p1;
        }else{
            return p2;
        }
    }
}
