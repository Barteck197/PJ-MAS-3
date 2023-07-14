package multiaspect;

public class Meat extends Product{
    private String animal;

    public Meat(String name, float price, boolean hasLongExpiryDate, String animal) {
        super(name, price, hasLongExpiryDate);
        this.animal = animal;
    }
}
