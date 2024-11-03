package entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")  // Avoid using "Order" as it is a reserved keyword
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId; // assuming orders are linked to a user
    private LocalDateTime orderDate;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderItem> orderItems; // assuming you have an OrderItem entity

    // Constructors, getters, and setters
    public Order() {
        this.orderDate = LocalDateTime.now();
    }

    // Getters and Setters
}
