
public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product WithDiscount(double discount){
        double discountedPrice = this.price - (this.price * discount);
        return new Product(this.name, discountedPrice);
    }
}