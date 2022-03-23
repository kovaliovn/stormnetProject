package org.example.homework.extrahw.for_while_do_while;

/**
 * Используя вложенные циклы while (цикл в цикле) выведи на экран прямоугольник размером 5 (высота) на 10 (ширина),
 * заполненный буквой 'Q'.
 * <p>
 * Пример вывода:
 * QQQQQQQQQQ
 * QQQQQQQQQQ
 * QQQQQQQQQQ
 * QQQQQQQQQQ
 * QQQQQQQQQQ
 * Требования:
 * •	Программа должна выводить текст на экран.
 * •	Программа должна выводить прямоугольник высотой 5 и шириной 10, заполненный буквами 'Q'.
 * •	В программе необходимо использовать вложенные циклы while (цикл в цикле).
 * •	Вывод на экран должен происходить в цикле while.
 */

public class Cycle4 {

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        String s = "Q";
        while (x < 5) {
            while (y < 10) {
                System.out.print(s);
                y++;
            }
            System.out.println();
            y = 0;
            x++;
        }
    }
}
