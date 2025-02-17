package com.listinterface.findnthelementfromendtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.LinkedList;

public class MainTest {
   @Test
    public void testMain(){
       LinkedList<String> linkedList= new LinkedList<>();
       Collections.addAll(linkedList,"A","B","C","D","E");
       int n = 2;
       for(int i=1;i<n;i++){
           linkedList.removeLast();
       }
       Assertions.assertEquals("D",linkedList.getLast(),"output should be D");
   }
}
