package com.dynamiconlinemarketplace;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog <T extends Product<?>>{
    private List<T> products=new ArrayList<>();
    public void addProduct(T product){
        products.add(product);
    }
    public void displayCatalog(){
        for(T product:products){
            System.out.println(product.toString());
        }
    }
}
