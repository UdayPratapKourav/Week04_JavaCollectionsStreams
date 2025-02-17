package com.setinterface.settosortedlisttest;

import com.setinterface.settosortedlist.SetToSortedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class SetToSortedListTest {
    public static List<Integer> getSortedList(Set<Integer> set){
        List<Integer>sortedList=new ArrayList<>();
        for(int i:set){
            sortedList.add(i);
        }
        Collections.sort(sortedList);
        return sortedList;
    }
    @Test
    public void checkList(){
        Set<Integer>set=new HashSet<>();
        Collections.addAll(set,5,3,9,1);
        List<Integer>result=new ArrayList<>();
        Collections.addAll(result,1,3,5,9);


        Assertions.assertEquals(result,SetToSortedList.getSortedList(set));
    }
}
