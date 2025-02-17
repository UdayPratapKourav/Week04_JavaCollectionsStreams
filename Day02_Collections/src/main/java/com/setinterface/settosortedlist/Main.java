package com.setinterface.settosortedlist;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer>set=new HashSet<>();
        Collections.addAll(set,5,3,9,1);

        System.out.println(SetToSortedList.getSortedList(set).toString());

    }
}
