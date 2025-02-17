package com.setinterface.checktwosetsequal;

import java.util.Set;

public class CheckSet {
    public static boolean checkSetEquals(Set<Integer>setOne, Set<Integer>setTwo){
       if(setTwo.size()!=setOne.size())return false;
        for(int a:setOne){
            if(!setTwo.contains(a)){
                return false;
            }

        }
        return true;
    }
}
