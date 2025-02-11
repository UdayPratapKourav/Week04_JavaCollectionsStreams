package com.dynamiconlinemarketplace;

public class Main {
    public static void main(String[] args) {
            ProductCatalog<Product<?>>catalog=new ProductCatalog<>();

            BookCategory fiction=new BookCategory("Fiction");
            ClothingCategory mens=new ClothingCategory("Men's Clothing");

            Book book= new Book("The moon",450.00,fiction);
            Clothing cloth=new Clothing("Polo shirt",200.00,mens);


            catalog.addProduct(book);
            catalog.addProduct(cloth);

        System.out.println("product catalog without discount");
        catalog.displayCatalog();

        DiscountUtil.applyDiscount(book,10);
        DiscountUtil.applyDiscount(cloth,12);

        System.out.println("product catalog after discount");

        catalog.displayCatalog();


    }
}
