package com.listinterface.reverselist;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Reverse {
    //Method for reverse the ArrayList
     public List<Integer> reverseList(List<Integer>list){

        int left= 0;
        int end = list.size()-1;
        while (left<end){
            int temp=list.get(left);
            list.set(left,list.get(end));
            list.set(end,temp);
            left++;
            end--;

        }

         return list;
     }
     //Method for reverse the linkedList
     public List<Integer>reverseLinkedList(List<Integer>linkedList){

         int left= 0;
         int end = linkedList.size()-1;
         while (left<end){
             int temp=linkedList.get(left);
             linkedList.set(left,linkedList.get(end));
             linkedList.set(end,temp);
             left++;
             end--;

         }

        return linkedList;
     }
}
