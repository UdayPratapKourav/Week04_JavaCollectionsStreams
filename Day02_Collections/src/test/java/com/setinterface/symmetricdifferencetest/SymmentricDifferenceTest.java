package com.setinterface.symmetricdifferencetest;

import com.setinterface.symmetricdifference.SymmetricDifference;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SymmentricDifferenceTest {
    public static Set<Integer> findSymmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        for (Integer element : set2) {
            if (!result.add(element)) {
                result.remove(element);
            }
        }
        return result;
    }
    @Test
    public void checkResult(){
        Set<Integer>set1=new HashSet<>();
        Set<Integer>set2=new HashSet<>();
        Collections.addAll(set1,1,2,3);
        Collections.addAll(set2,3,4,5);

        Set<Integer>result=new HashSet<>();
        Collections.addAll(result,1,2,4,5);



        Assertions.assertEquals(result,SymmetricDifference.findSymmetricDifference(set1,set2));
    }
}
