import com.lelynx.homeshop.delivery.Delivery;
import com.lelynx.homeshop.delivery.ExpressDelivery;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExpressDeliveryTest {

    @Test
    void Given_ExpressDeliveryParis_WhenGettingPrice_Get6e99() {
        Delivery delivery = new ExpressDelivery("Paris");
        assertEquals(6.99, delivery.getPrice(), 0.01);
    }

    @Test
    void Given_ExpressDeliveryOutsideParis_WhenGettingPrice_Get9e99() {
        Delivery delivery = new ExpressDelivery("Lyon");
        assertEquals(9.99, delivery.getPrice(), 0.01);
    }
}
