package com.listinterface.reverselist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        List<Integer>linkedList=new LinkedList<>();
        //1,2,3,4,5
        for(int i=0;i<5;i++){
            list.add(i+1);
            linkedList.add(i+1);
        }
        System.out.println("Original List or Linked list");
        System.out.println(list.toString());
        System.out.println(linkedList.toString());
        //Making object of Reverse class
        Reverse listt=new Reverse();

        System.out.println("Reversed List");
        System.out.println(listt.reverseList(list).toString());

        System.out.println("Reversed LinkedList");
        System.out.println(listt.reverseLinkedList(linkedList).toString());


    }
}
