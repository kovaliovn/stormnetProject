package org.example.homework.extrahw.for_while_do_while;

/**
 * Вывести на экран сумму чисел от 1 до 100 включительно, не кратных 3. Для этого используй цикл while.
 * <p>
 * Подсказка: чтобы в цикле перейти к следующему числу, используй оператор continue.
 * Требования:
 * •	Программа должна вывести в консоль сумму всех чисел от 1 до 100 включительно, не кратных 3.
 * •	В программе необходимо использовать цикл while.
 * •	В программе необходимо использовать оператор continue.
 */

public class Cycle6 {

    public static void main(String[] args) {
        int a = 1;
        int sum = 0;

        while (a <= 100) {
            if (a % 3 == 0) {
                a++;
                continue;
            }
            sum += a;
            a++;
        }
        System.out.println(sum);
    }
}
