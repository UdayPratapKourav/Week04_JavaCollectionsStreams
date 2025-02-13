package com.listinterface.rotateelements;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,10,20,30,40,50);
        Rotate rotate=new Rotate();
        System.out.println(rotate.rotate(list,2).toString());


    }
}

