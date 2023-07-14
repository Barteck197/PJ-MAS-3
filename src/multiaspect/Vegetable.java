package multiaspect;

public class Vegetable extends Product{
    private String cityOfOrigin;

    public Vegetable(String name, float price, boolean hasLongExpiryDate, String cityOfOrigin) {
        super(name, price, hasLongExpiryDate);
        this.cityOfOrigin = cityOfOrigin;
    }
}
