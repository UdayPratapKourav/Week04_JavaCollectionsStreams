package com.listinterface.removeduplicatestest;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    public List<Integer> removeDuplicates(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--;
                }
            }
        }
        return list;
    }
    @Test
    public void testRemoveDuplicates() {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(3, 1, 2, 2, 3, 4));
        List<Integer> expectedList = Arrays.asList(3, 1, 2, 4);

        List<Integer> actualList = removeDuplicates(inputList);

        assertEquals(expectedList, actualList);
    }

}
