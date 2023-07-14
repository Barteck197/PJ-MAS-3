package multiaspect;

public abstract class Product {
    private String name;
    private float price;
    private boolean hasLongExpiryDate;

    public Product(String name, float price, boolean hasLongExpiryDate) {
        this.name = name;
        this.price = price;
        this.hasLongExpiryDate = hasLongExpiryDate;
    }
}
