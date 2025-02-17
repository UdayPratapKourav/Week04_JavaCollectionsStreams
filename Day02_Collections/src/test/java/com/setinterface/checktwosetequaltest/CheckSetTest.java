package com.setinterface.checktwosetequaltest;

import com.setinterface.checktwosetsequal.CheckSet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CheckSetTest {
    public static boolean checkSetEquals(Set<Integer> setOne, Set<Integer>setTwo){
        if(setTwo.size()!=setOne.size())return false;
        for(int a:setOne){
            if(!setTwo.contains(a)){
                return false;
            }

        }
        return true;
    }
    @Test
    public void testCheckSetEquals(){
        Set<Integer>setOne=new HashSet<>();
        Set<Integer>setTwo=new HashSet<>();
        Collections.addAll(setOne,1,2,3);
        Collections.addAll(setTwo,1,2,3);

        boolean isEquals= CheckSet.checkSetEquals(setOne,setTwo);
        Assertions.assertEquals(true,isEquals);
    }
}
