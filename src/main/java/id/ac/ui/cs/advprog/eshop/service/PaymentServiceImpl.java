package id.ac.ui.cs.advprog.eshop.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import id.ac.ui.cs.advprog.eshop.enums.OrderStatus;
import id.ac.ui.cs.advprog.eshop.enums.PaymentMethod;
import id.ac.ui.cs.advprog.eshop.model.Order;
import id.ac.ui.cs.advprog.eshop.model.Payment;
import id.ac.ui.cs.advprog.eshop.repository.PaymentRepository;

import java.util.*;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public Payment addPayment(Order order, String method, Map<String, String> paymentData) {
        if (method.equals(PaymentMethod.VOUCHER_CODE.getValue()) && paymentData.get(PaymentMethod.VOUCHER_CODE.getValue()) != null) {
            if (voucherCodeValidation(paymentData.get(PaymentMethod.VOUCHER_CODE.getValue()))) {
                Payment payment = new Payment(String.valueOf(paymentRepository.findAll().size()+1), method, paymentData, OrderStatus.SUCCESS.getValue());
                paymentRepository.save(payment);
                return payment;
            } else {
                Payment payment = new Payment(String.valueOf(paymentRepository.findAll().size()+1), method, paymentData, OrderStatus.REJECTED.getValue());
                paymentRepository.save(payment);
                return payment;
            }
        } else if (method.equals(PaymentMethod.BANK_TRANSFER.getValue())) {
            if (!paymentData.keySet().isEmpty() && !paymentData.values().isEmpty()) {
                Payment payment = new Payment(String.valueOf(paymentRepository.findAll().size()+1), method, paymentData, OrderStatus.SUCCESS.getValue());
                paymentRepository.save(payment);
                return payment;
            } else {
                Payment payment = new Payment(String.valueOf(paymentRepository.findAll().size()+1), method, paymentData, OrderStatus.REJECTED.getValue());
                paymentRepository.save(payment);
                return payment;
            }
        }
        return null;
    }

    @Override
    public Payment addPayment(Payment payment) {
        paymentRepository.save(payment);
        return payment;
    }

    @Override
    public Payment setStatus(Payment payment, String status) {
        Payment result = paymentRepository.findById(payment.getId());
        if (result != null) {
            Payment newPayment = new Payment(payment.getId(), payment.getMethod(), payment.getPaymentData(), status);
            paymentRepository.save(newPayment);
            return newPayment;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public Payment getPayment(String id) {
        return paymentRepository.findById(id);
    }

    @Override
    public List<Payment> getAllPayment() {
        return paymentRepository.findAll();
    }

    public boolean voucherCodeValidation(String voucherCode) {
        boolean valid;
        int counter = 0;
        valid = voucherCode.substring(0, 4).equals(PaymentMethod.ESHOP.getValue()) && voucherCode.length() == 16;
        for (char c : voucherCode.toCharArray()) {
            if (Character.isDigit(c)) {
                counter++;
            }
        }
        if (counter == 8) {
            valid = true;
        } else {
            valid = false;
        }
        return valid;
    }
}