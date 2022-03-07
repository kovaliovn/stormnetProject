package org.example.lectures.arrays;

import java.util.Arrays;

public class ArraysLesson {

    public static void main(String[] args) {
        /*int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        myArray[4] = 77;*/
        int[] myArray = new int[10];
        Arrays.fill(myArray, 1);
        for (int value : myArray) {
            System.out.println(value);
        }
        System.out.println(myArray[4]);
        int length = myArray.length;
        System.out.println(length);
    }
}
