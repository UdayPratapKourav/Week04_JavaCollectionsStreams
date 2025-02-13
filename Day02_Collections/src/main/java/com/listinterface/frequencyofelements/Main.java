package com.listinterface.frequencyofelements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();//Input: ["apple", "banana", "apple", "orange"]
        Map<String,Integer>map=new HashMap<>();
        //Adding the strings in list
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");

        for(int i=0;i<list.size();i++){
            map.put(list.get(i),map.getOrDefault(list.get(i),0)+1);
        }
        System.out.println(map);

    }
}
