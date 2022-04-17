package org.example.homework.extrahw.array_list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * В классе List8 объявлены методы, которые тебе нужно реализовать следующим образом:
 * <p>
 * removeBugWithFor(ArrayList<String>) - должен удалить строку из списка, если она содержит слово bug, используя цикл
 * for и счетчик.
 * removeBugWithWhile(ArrayList<String>) - должен удалить строку из списка, если она содержит слово bug, используя цикл
 * while и метод iterator().
 * removeBugWithCopy(ArrayList<String>) - должен удалить строку из списка, если она содержит слово bug, используя цикл
 * for-each и копию списка.
 * В слове bug может быть разный регистр букв (BUg, BuG, и т.д.).
 * Метод main реализован для вашего кода и не участвует в проверке.
 * Требования:
 * •	В классе List8 должен быть публичный статический метод removeBugWithFor(ArrayList<String>) с типом
 * возвращаемого значения void.
 * •	В классе List8 должен быть публичный статический метод removeBugWithWhile(ArrayList<String>) с типом
 * возвращаемого значения void.
 * •	В классе List8 должен быть публичный статический метод removeBugWithCopy(ArrayList<String>) с типом
 * возвращаемого значения void.
 * •	Метод removeBugWithFor(ArrayList<String>) должен работать согласно условию.
 * •	Метод removeBugWithWhile(ArrayList<String>) должен работать согласно условию.
 * •	Метод removeBugWithCopy(ArrayList<String>) должен работать согласно условию.
 */

public class List8 {

    public static String bug = "bug";

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello world!");
        words.add("Amigo");
        words.add("Elly");
        words.add("Kerry");
        words.add("Bug");
        words.add("bug");
        words.add("Easy ug");
        words.add("Risha");

        ArrayList<String> copyWordsFirst = new ArrayList<>(words);
        ArrayList<String> copyWordsSecond = new ArrayList<>(words);
        ArrayList<String> copyWordsThird = new ArrayList<>(words);

        removeBugWithFor(copyWordsFirst);
        removeBugWithWhile(copyWordsSecond);
        removeBugWithCopy(copyWordsThird);

        copyWordsFirst.forEach(System.out::println);
        String line = "_________________________";
        System.out.println(line);
        copyWordsSecond.forEach(System.out::println);
        System.out.println(line);
        copyWordsThird.forEach(System.out::println);
        System.out.println(line);
    }

    public static void removeBugWithFor(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (bug.equalsIgnoreCase(str)) {
                list.remove(str);
                i--;
            }
        }
    }

    public static void removeBugWithWhile(ArrayList<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (bug.equalsIgnoreCase(str)) {
                iterator.remove();
            }
        }
    }

    public static void removeBugWithCopy(ArrayList<String> list) {
        ArrayList<String> listCopy = new ArrayList<>(list);
        for (String str : listCopy) {
            if (bug.equalsIgnoreCase(str)) {
                list.remove(str);
            }
        }
    }
}
