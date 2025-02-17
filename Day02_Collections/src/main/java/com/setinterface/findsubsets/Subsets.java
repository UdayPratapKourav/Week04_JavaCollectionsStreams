package com.setinterface.findsubsets;

import java.util.Set;

public class Subsets {
    public static boolean isSubset(Set<Integer>set1,Set<Integer>set2){
        for(int a:set1){
            if(!set2.contains(a)){
                return false;
            }
        }
        return true;
    }
}
