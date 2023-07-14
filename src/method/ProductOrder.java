package method;

import java.time.LocalDate;

// Zamówienie produktu
public class ProductOrder extends Order{
    private float productPrice;
    private int quantity;

    public ProductOrder(LocalDate newOrderDate, float productPrice, int quantity) {
        super(newOrderDate);
        this.productPrice = productPrice;
        this.quantity = quantity;
    }

    // Cena za zamówienie: cena produktu * ilość
    private float getOrderCost(){
        return productPrice * quantity;
    }

    @Override
    public float getOrderValue() {
        return getOrderCost();
    }
}
