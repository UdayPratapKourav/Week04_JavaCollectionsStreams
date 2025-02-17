package com.setinterface.checktwosetsequal;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer>setOne=new HashSet<>();
        Set<Integer>setTwo=new HashSet<>();
        Collections.addAll(setOne,1,2,3);
        Collections.addAll(setTwo,1,2,3);

        boolean isEquals= CheckSet.checkSetEquals(setOne,setTwo);

        System.out.println(isEquals);
    }
}
