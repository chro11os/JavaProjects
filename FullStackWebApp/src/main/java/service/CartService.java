package service;

import entity.Cart;
import entity.CartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CartRepository;

import java.util.List;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public Cart createCart(Cart cart) {
        return cartRepository.save(cart);
    }

    public List<Cart> getAllCarts() {
        return cartRepository.findAll();
    }

    public Cart getCartByUserId(Long userId) {
        // Implement logic to find cart by user ID
        return cartRepository.findByUserId(userId);
    }

    public Cart addItemToCart(Long cartId, CartItem cartItem) {
        // Implement logic to add item to the cart
        Cart cart = cartRepository.findById(cartId).orElse(null);
        if (cart != null) {
            cart.getCartItems().add(cartItem);
            cartItem.setCart(cart);
            return cartRepository.save(cart);
        }
        return null;
    }

    // Other cart-related methods, like removing items, etc.
}
