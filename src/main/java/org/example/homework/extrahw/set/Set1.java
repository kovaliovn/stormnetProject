package org.example.homework.extrahw.set;

import java.util.Collections;
import java.util.HashSet;

/**
 * В классе Set1 есть метод arrayToHashSet(String[]), который должен из переданного массива вернуть HashSet<String> с
 * теми же элементами.
 * Метод main не участвует в проверке.
 * Требования:
 * •	В классе Set1 должен быть public static HashSet<String> arrayToHashSet(String[]) метод.
 * •	Метод arrayToHashSet(String[]) должен быть реализован согласно условию.
 */

public class Set1 {
    public static void main(String[] args) {
        String[] array = {"Через", "три", "года", "я", "буду", "Senior", "Java", "Developer"};
        for (String value : array) {
            System.out.println(value);
        }
        System.out.println("___________________________________");

        HashSet<String> hashSet = arrayToHashSet(array);
        for (String s : hashSet) {
            System.out.println(s);
        }
    }

    public static HashSet<String> arrayToHashSet(String[] strings) {
        HashSet<String> hashSet = new HashSet<>();
        Collections.addAll(hashSet, strings);
        return hashSet;
    }
}
