package com.shoppingcart;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {

    @Test
    public void testAddToCart() {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct("Phone", 500);
        cart.addToCart("Phone", 1);

        assertEquals(500, cart.getTotalPrice());
    }

    @Test
    public void testRemoveFromCart() {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct("Phone", 500);
        cart.addToCart("Phone", 1);
        cart.removeFromCart("Phone");

        assertEquals(0, cart.getTotalPrice());
    }

    @Test
    public void testMultipleItemsInCart() {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct("Laptop", 1000);
        cart.addProduct("Mouse", 20);
        cart.addToCart("Laptop", 1);
        cart.addToCart("Mouse", 2);

        assertEquals(1040, cart.getTotalPrice());
    }

    @Test
    public void testEmptyCart() {
        ShoppingCart cart = new ShoppingCart();
        assertEquals(0, cart.getTotalPrice());
    }
}
