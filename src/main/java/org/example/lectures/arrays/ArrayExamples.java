package org.example.lectures.arrays;

import java.util.ArrayList;

public class ArrayExamples {

    public static void main(String[] args) {
        ArrayList<Integer> arrayInt = new ArrayList<>();
        arrayInt.add(1);
        arrayInt.add(2);
        arrayInt.add(5);
        arrayInt.add(43);
        arrayInt.add(588);
        for (int a : arrayInt) {
            System.out.println(a);
        }
    }
}

