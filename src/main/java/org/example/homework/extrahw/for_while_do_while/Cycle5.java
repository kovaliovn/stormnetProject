package org.example.homework.extrahw.for_while_do_while;

import java.util.Locale;
import java.util.Scanner;

/**
 * Вводим данные с клавиатуры и сразу их выводим на экран, пока не будет введено слово "enough".
 * Слово "enough" выводить не нужно.
 * Для этого необходимо использовать бесконечный цикл (while(true)).
 * <p>
 * Подсказка: чтобы завершить бесконечный цикл, используй оператор break.
 * Требования:
 * •	Программа должна считывать данные c клавиатуры.
 * •	В программе необходимо использовать цикл while.
 * •	Для завершения бесконечного цикла необходимо использовать оператор break.
 * •	Программа должна выводить в консоли все введенные данные с новой строки, пока на будет введено слово "enough".
 */

public class Cycle5 {

    private static final String ENOUGH_STRING = "ENOUGH";

    public static void main(String[] args) {
        while (true) {
            String result = "";
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите данные: ");
            result = scanner.nextLine();
            System.out.println(result);
            if (result.equals(ENOUGH_STRING)) {
                break;
            }
        }
    }
}
