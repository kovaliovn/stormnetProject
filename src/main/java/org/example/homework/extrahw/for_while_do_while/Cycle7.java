package org.example.homework.extrahw.for_while_do_while;

/**
 * Напиши программу, в которой с помощью цикла for на экран будут выведены чётные числа от 1 до 15.
 * Каждое значение нужно выводить с новой строки.
 * Требования:
 * •	Программа должна выводить текст на экран.
 * •	Программа должна выводить чётные числа от 1 до 15. Каждое значение вывести с новой строки.
 * •	В программе необходимо использовать цикл for.
 */

public class Cycle7 {

    public static void main(String[] args) {
        int[] a = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int result = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                result = a[i];
                System.out.println(result);
            }
        }
    }
}
