package method;

import java.time.Duration;
import java.time.LocalDate;

// Zamówienie usługi
public class ServiceOrder extends Order{
    public float pricePerHour;
    public Duration serviceDuration;

    public ServiceOrder(LocalDate newOrderDate, float pricePerHour, Duration serviceDuration) {
        super(newOrderDate);
        this.pricePerHour = pricePerHour;
        this.serviceDuration = serviceDuration;
    }

    // Cena zamówienia: czas trwania * cena za godzinę
    private float getServiceCost(){
        return pricePerHour * serviceDuration.toHours();
    }

    @Override
    public float getOrderValue() {
        return getServiceCost();
    }
}
