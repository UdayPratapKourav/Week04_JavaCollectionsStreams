package com.listinterface.findnthelementfromend;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList= new LinkedList<>();
        Collections.addAll(linkedList,"A","B","C","D","E");
        int n = 2;
       for(int i=1;i<n;i++){
           linkedList.removeLast();
       }
        System.out.println(linkedList.getLast());


    }
}
