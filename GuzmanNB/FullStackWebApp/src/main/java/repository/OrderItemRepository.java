package repository;

import entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    // Find all order items by order ID
    List<OrderItem> findByOrderId(Long orderId);

    // Optional: Delete all order items by order ID
    void deleteByOrderId(Long orderId);
}
