package com.setinterface.symmetricdifference;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    public static Set<Integer> findSymmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        for (Integer element : set2) {
            if (!result.add(element)) {
                result.remove(element);
            }
        }
        return result;
    }
}
