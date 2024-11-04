package repository;

import entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    // Find all items in a specific cart by cart ID
    List<CartItem> findByCartId(Long cartId);

    // Optional: Find a cart item by product ID within a specific cart
    CartItem findByCartIdAndProductId(Long cartId, Long productId);

    // Optional: Delete all items by cart ID
    void deleteByCartId(Long cartId);
}
