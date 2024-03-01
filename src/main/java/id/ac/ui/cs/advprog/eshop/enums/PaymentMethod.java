package id.ac.ui.cs.advprog.eshop.enums;

import lombok.*;

@Getter
public enum PaymentMethod {
    VOUCHER_CODE("voucherCode"),
    ESHOP("ESHOP"),
    BANK_TRANSFER("Bank Transfer");

    private final String value;
    private PaymentMethod(String value) {
        this.value = value;
    }

    public static boolean contains (String param) {
        for (OrderStatus orderStatus : OrderStatus.values()) {
            if (orderStatus.name().equals(param)) {
                return true;
            }
        }
        return false;
    }
}
