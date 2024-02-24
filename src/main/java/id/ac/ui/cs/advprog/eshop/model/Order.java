package id.ac.ui.cs.advprog.eshop.model;
import java.util.List;

import lombok.*;

@Getter @Setter
public class Order {
    private String id;
    private List<Product> products;
    private long timestamp;
    private String autor;
    private String status;

    public Order(String id, List<Product> products, long timestamp, String author) {
        this.id = id;
        this.products = products;
        this.timestamp = timestamp;
        this.autor = author;
        this.status = "WAITING_PAYMENT";
    }

    public Order(String id, List<Product> products, long timestamp, String author, String status) {
        this.id = id;
        this.products = products;
        this.timestamp = timestamp;
        this.autor = author;
        if (status.equals("SUCCESS") || status.equals("FAILED") || status.equals("WAITING_PAYMENT")) {
            this.status = status;
        } else {
            throw new IllegalArgumentException("Invalid status");
        }
    }

    public void setStatus(String status) {
        if (status.equals("SUCCESS") || status.equals("FAILED") || status.equals("WAITING_PAYMENT")) {
            this.status = status;
        } else {
            throw new IllegalArgumentException("Invalid status");
        }
    }
}