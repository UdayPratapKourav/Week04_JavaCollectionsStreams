package com.dynamiconlinemarketplace;

public class Product<T>{
    private String name;
    private double price;
    private T category;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public T getCategory() {
        return category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

   public Product(String name, double price, T category){
        this.name=name;
        this.price=price;
        this.category=category;
    }

    public String toString() {
        return name + " - $" + price + " (Category: " + category + ")";
    }
}
