package com.setinterface.settosortedlist;

import java.util.*;

public class SetToSortedList {
    public static List<Integer>getSortedList(Set<Integer> set){
        List<Integer>sortedList=new ArrayList<>();
        for(int i:set){
            sortedList.add(i);
        }
        Collections.sort(sortedList);
        return sortedList;
    }
}
