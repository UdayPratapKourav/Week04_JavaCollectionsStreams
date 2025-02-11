package com.dynamiconlinemarketplacetest;

import com.dynamiconlinemarketplace.Book;
import com.dynamiconlinemarketplace.BookCategory;
import com.dynamiconlinemarketplace.DiscountUtil;
import com.dynamiconlinemarketplace.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscountUtilTest {
    @Test
      public void checkDiscountUtil(){
        Product<String> product = new Product<>("Monitor", 200.00, "Electronics");
        DiscountUtil.applyDiscount(product, 10); // Applying 10% discount

        assertEquals(180.00, product.getPrice(), 0.001, "Price should be updated to 180.00 after 10% discount");




    }
}
