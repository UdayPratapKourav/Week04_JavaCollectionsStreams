package com.setinterface.findsubsetstest;

import com.setinterface.findsubsets.Subsets;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SubsetsTest {
    public static boolean isSubset(Set<Integer> set1, Set<Integer>set2){
        for(int a:set1){
            if(!set2.contains(a)){
                return false;
            }
        }
        return true;
    }

    @Test
    public void checkSubset(){
        Set<Integer>set1=new HashSet<>();
        Set<Integer>set2=new HashSet<>();

        Collections.addAll(set1,2,3);
        Collections.addAll(set2,1,2,3,4);

        boolean isSubset= Subsets.isSubset(set1,set2);
        Assertions.assertEquals(true,isSubset);
    }
}
