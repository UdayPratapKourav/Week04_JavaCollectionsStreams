package com.smartwarehousemanagementsystem;

import java.util.List;

public class WarehouseDisplay {
    public static void displayItems(List<? extends WarehouseItem> items){
        for(WarehouseItem item : items){
            System.out.println(item.getName());
            System.out.println(item.getPrice());
        }
    }
}
