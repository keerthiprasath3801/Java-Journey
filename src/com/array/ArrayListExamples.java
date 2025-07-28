package com.array;

import java.util.ArrayList;

public class ArrayListExamples {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(10);
        list.add(10);
        list.add(60);
        list.add(50);
        list.add(70);
        System.out.println(list.contains(10));
        System.out.println(list);
        list.set(0,22);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
    }
}
