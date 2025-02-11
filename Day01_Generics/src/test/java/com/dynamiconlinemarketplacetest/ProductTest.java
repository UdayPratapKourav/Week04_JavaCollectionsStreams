package com.dynamiconlinemarketplacetest;

import com.dynamiconlinemarketplace.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {
    @Test
    void testProductCreation() {
        Product<String> product = new Product<>("Laptop", 999.99, "Electronics");

        assertEquals("Laptop", product.getName(), "Product name should be 'Laptop'");
        assertEquals(999.99, product.getPrice(), 0.001, "Product price should be 999.99");
        assertEquals("Electronics", product.getCategory(), "Product category should be 'Electronics'");
    }

    @Test
    void testSetPrice(){
        Product<String>product = new Product<>("Laptop",799.99,"Electronics");
        product.setPrice(899.00);
        assertEquals(899.00,product.getPrice(),0.001,"price should be updated to 899.00");

    }


}
