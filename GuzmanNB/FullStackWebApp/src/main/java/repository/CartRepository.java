package repository;

import entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
    // Custom query method to find a cart by user ID
    Cart findByUserId(Long userId);
}