package com.listinterface.rotateelementstest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotateTest {
    public List<Integer> rotate(List<Integer> list, int position) {

        for(int i=0;i<position;i++){
            int temp = list.remove(0);
            list.add(temp);
        }
        return list;

    }

    @Test
    public void testRotate(){
        List<Integer>oriList=new ArrayList<>();
        Collections.addAll(oriList,10,20,30,40,50);
        List<Integer>list = new ArrayList<>();
        Collections.addAll(list,30,40,50,10,20);

        Assertions.assertEquals(list,rotate(oriList,2));

    }
}
