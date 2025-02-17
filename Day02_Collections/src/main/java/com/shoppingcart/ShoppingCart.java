package com.shoppingcart;



import java.util.*;

public class ShoppingCart {
    private Map<String, Double> productPrices = new HashMap<>(); // Stores product prices
    private Map<String, Integer> cart = new LinkedHashMap<>(); // Maintains order of items added
    private TreeMap<Double, List<String>> sortedByPrice = new TreeMap<>(); // Sorts items by price

    // Add product to the product list
    public void addProduct(String product, double price) {
        productPrices.put(product, price);
    }

    // Add product to the cart
    public void addToCart(String product, int quantity) {
        if (!productPrices.containsKey(product)) {
            throw new IllegalArgumentException("Product not found: " + product);
        }
        cart.put(product, cart.getOrDefault(product, 0) + quantity);

        // Update TreeMap sorting by price
        double price = productPrices.get(product);
        sortedByPrice.computeIfAbsent(price, k -> new ArrayList<>()).add(product);
    }

    // Remove a product from the cart
    public void removeFromCart(String product) {
        if (cart.containsKey(product)) {
            cart.remove(product);
            sortedByPrice.values().forEach(list -> list.remove(product));
        }
    }

    // Get total cart value
    public double getTotalPrice() {
        double total = 0;
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            total += productPrices.get(entry.getKey()) * entry.getValue();
        }
        return total;
    }

    // Display cart items in order of addition
    public void displayCart() {
        System.out.println("Shopping Cart (Order of Addition):");
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " x" + entry.getValue() + " - $" + productPrices.get(entry.getKey()));
        }
    }

    // Display cart items sorted by price
    public void displayCartSortedByPrice() {
        System.out.println("Shopping Cart (Sorted by Price):");
        for (Map.Entry<Double, List<String>> entry : sortedByPrice.entrySet()) {
            for (String product : entry.getValue()) {
                System.out.println(product + " - $" + entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct("Laptop", 1000);
        cart.addProduct("Mouse", 20);
        cart.addProduct("Keyboard", 50);
        cart.addProduct("Monitor", 200);

        cart.addToCart("Laptop", 1);
        cart.addToCart("Mouse", 2);
        cart.addToCart("Keyboard", 1);
        cart.addToCart("Monitor", 1);

        cart.displayCart();
        System.out.println("Total Price: $" + cart.getTotalPrice());

        cart.displayCartSortedByPrice();
    }
}
