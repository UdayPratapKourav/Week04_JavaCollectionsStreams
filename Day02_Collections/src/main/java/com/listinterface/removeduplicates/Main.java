package com.listinterface.removeduplicates;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        Collections.addAll(list,3,1,2,2,3,4);
        System.out.println("The list we have :");
        System.out.println(list.toString());
        System.out.println("List after remove duplicate :");
       for(int i=0;i<list.size();i++){
           for(int j=i+1;j<list.size();j++){
               if(list.get(i)==list.get(j)){
                   list.remove(j);
                   j--;
               }
           }
       }


        System.out.println(list.toString());
    }
}
