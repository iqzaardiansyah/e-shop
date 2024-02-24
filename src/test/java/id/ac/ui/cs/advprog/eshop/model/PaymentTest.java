package id.ac.ui.cs.advprog.eshop.model;
import org.junit.jupiter.api.Test;
import id.ac.ui.cs.advprog.eshop.enums.OrderStatus;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentTest {
    @Test
    public void testCreatePayment() {
        Payment newPayment = new Payment("1", "voucherCode", Map.of("voucherCode", "ESHOP1234567890"));
        assertEquals("1", newPayment.getId());
        assertEquals("voucherCode", newPayment.getMethod());
        assertEquals(Map.of("voucherCode", "ESHOP1234567890"), newPayment.getPaymentData());
        assertEquals(OrderStatus.WAITING_PAYMENT.getValue(), newPayment.getStatus());
    }

    @Test
    public void testCreatePaymentWithStatus() {
        Payment newPayment = new Payment("1", "voucherCode", Map.of("voucherCode", "ESHOP1234567890"), OrderStatus.SUCCESS.getValue());
        assertEquals("1", newPayment.getId());
        assertEquals("voucherCode", newPayment.getMethod());
        assertEquals(Map.of("voucherCode", "ESHOP1234567890"), newPayment.getPaymentData());
        assertEquals(OrderStatus.SUCCESS.getValue(), newPayment.getStatus());
    }

    @Test
    void testCreatePaymentWithEmptyPaymentData() {
        assertThrows(IllegalArgumentException.class, () -> new Payment("1", "voucherCode", Map.of()));
    }

    @Test
    void testCreatePaymentWithInvalidStatus() {
        assertThrows(IllegalArgumentException.class, () -> new Payment("1", "voucherCode", Map.of("voucherCode", "ESHOP1234567890"), "INVALID_STATUS"));
    }

    @Test
    void testSetStatus() {
        Payment newPayment = new Payment("1", "voucherCode", Map.of("voucherCode", "ESHOP1234567890"));
        newPayment.setStatus(OrderStatus.SUCCESS.getValue());
        assertEquals(OrderStatus.SUCCESS.getValue(), newPayment.getStatus());
    }

    @Test
    void testSetInvalidStatus() {
        Payment newPayment = new Payment("1", "voucherCode", Map.of("voucherCode", "ESHOP1234567890"));
        assertThrows(IllegalArgumentException.class, () -> newPayment.setStatus("INVALID_STATUS"));
    }

    @Test
    void testSetStatusWithEmptyPaymentData() {
        assertThrows(IllegalArgumentException.class, () -> new Payment("1", "voucherCode", Map.of()));
    }
}
