package com.setinterface.symmetricdifference;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer>set1=new HashSet<>();
        Set<Integer>set2=new HashSet<>();
        Collections.addAll(set1,1,2,3);
        Collections.addAll(set2,3,4,5);

        System.out.println(SymmetricDifference.findSymmetricDifference(set1,set2).toString());
    }
}
