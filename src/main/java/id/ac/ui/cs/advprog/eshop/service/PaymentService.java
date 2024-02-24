package id.ac.ui.cs.advprog.eshop.service;
import id.ac.ui.cs.advprog.eshop.model.Order;
import id.ac.ui.cs.advprog.eshop.model.Payment;

import java.util.*;

public interface PaymentService {
    public Payment addPayment(Order order, String method, Map<String, String> paymentData);
    public Payment addPayment(Payment payment);
    public Payment setStatus(Payment payment, String status);
    public Payment getPayment(String id);
    public List<Payment> getAllPayment();
}
