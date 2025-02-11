package com.smartwarehousemanagementsystem;



public class Main {
    public static void main(String[] args) {
         Storage<Electronics>electronicsStorage=new Storage<>();
         Storage<Groceries>groceriesStorage=new Storage<>();
         Storage<Furniture>furnitureStorage=new Storage<>();

         electronicsStorage.addItem(new Electronics("laptop",56000.0));
         electronicsStorage.addItem(new Electronics("phone",14000.0));

         groceriesStorage.addItem(new Groceries("Oil",165.0));
         groceriesStorage.addItem(new Groceries("milk",12.0));

         furnitureStorage.addItem(new Furniture("chair",500.0));
         furnitureStorage.addItem(new Furniture("table",2000.0));

        System.out.println("Electronics");
        WarehouseDisplay.displayItems(electronicsStorage.getAllItems());

        System.out.println();
        System.out.println("Groceries");
        WarehouseDisplay.displayItems(groceriesStorage.getAllItems());

        System.out.println();
        System.out.println("Furniture");
        WarehouseDisplay.displayItems(furnitureStorage.getAllItems());


    }
}
