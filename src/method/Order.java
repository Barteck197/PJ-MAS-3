package method;

import java.time.LocalDate;

public abstract class Order {
    private static int globalOrderID = 0;
    private int orderID;
    private LocalDate orderDate;

    public Order(LocalDate newOrderDate) {
        orderID = ++globalOrderID;
        orderDate = newOrderDate;
    }

    public abstract float getOrderValue();
}
