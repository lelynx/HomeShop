import com.lelynx.homeshop.delivery.Delivery;
import com.lelynx.homeshop.delivery.RelayDelivery;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RelayDeliveryTest {

    @Test
    void given_FreeRelay_whenGettingDeliveryPrice_ThenGet0e() {
        Delivery delivery = new RelayDelivery(1);
        assertEquals(0.0, delivery.getPrice(), 0.01);
    }

    @Test
    void Given_LowPriceRelay_WhenGettingPrice_Get2e99() {
        Delivery delivery = new RelayDelivery(30);
        assertEquals(2.99, delivery.getPrice(), 0.01);
    }

    @Test
    void Given_HighPriceRelay_WhenGettingPrice_Get4e99() {
        Delivery delivery = new RelayDelivery(50);
        assertEquals(4.99, delivery.getPrice(), 0.01);
    }
}
