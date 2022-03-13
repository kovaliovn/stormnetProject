package org.example.homework.extrahw.for_while_do_while;

/**
 * Используя цикл while вывести на экран сто раз цитату (переменная quote):
 * «Я никогда не буду работать за копейки. Амиго»
 * <p>
 * Каждое значение вывести с новой строки.
 * Требования:
 * •	Программа должна выводить текст на экран.
 * •	Программа должна выводить на экран 100 раз содержимое переменной quote.
 * •	В программе необходимо использовать цикл while.
 */

public class Cycle {

    public static void main(String[] args) {
        String quote = "Я никогда не буду работать за копейки. Амиго";
        int i = 1;
        while (i <= 100) {
            System.out.println(quote);
            i++;
        }
    }
}
