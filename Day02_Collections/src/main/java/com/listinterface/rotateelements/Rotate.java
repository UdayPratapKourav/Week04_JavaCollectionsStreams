package com.listinterface.rotateelements;

import java.util.ArrayList;
import java.util.List;

public class Rotate {
    //Method for rotate the list
    public List<Integer> rotate(List<Integer> list, int position) {

        for(int i=0;i<position;i++){
            int temp = list.remove(0);
            list.add(temp);
        }
        return list;

    }

}
