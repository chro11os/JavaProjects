package service;

import entity.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.OrderItemRepository;

import java.util.List;

@Service
public class OrderItemService {

    @Autowired
    private OrderItemRepository orderItemRepository;

    // Add a new OrderItem
    public OrderItem addOrderItem(OrderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }

    // Get all OrderItems by order ID
    public List<OrderItem> getOrderItemsByOrderId(Long orderId) {
        return orderItemRepository.findByOrderId(orderId);
    }

    // Delete all OrderItems by order ID
    public void clearOrderItems(Long orderId) {
        orderItemRepository.deleteByOrderId(orderId);
    }
}
