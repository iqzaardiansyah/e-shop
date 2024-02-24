package id.ac.ui.cs.advprog.eshop.model;
import java.util.Map;

import id.ac.ui.cs.advprog.eshop.enums.OrderStatus;
import lombok.*;

@Getter
public class Payment {
    private String id;
    private String method;
    private Map<String, String> paymentData;
    @Setter
    private String status;


    public Payment(String id, String method, Map<String, String> paymentData) {
    }

    public Payment(String id, String method, Map<String, String> paymentData, String status) {
    }
}
