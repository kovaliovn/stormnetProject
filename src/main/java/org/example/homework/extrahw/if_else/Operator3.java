package org.example.homework.extrahw.if_else;

import java.util.Scanner;

/**
 * Ввести с клавиатуры температуру на улице. Если температура меньше 0, вывести надпись "на улице холодно", иначе -
 * вывести надпись "на улице тепло".
 * Требования:
 * •	Программа должна считывать значение температуры c клавиатуры.
 * •	Программа должна использовать команду System.out.println() или System.out.print().
 * •	Если температура меньше 0, вывести только сообщение "на улице холодно".
 * •	Если температура больше либо равна 0, вывести только сообщение "на улице тепло".
 */

public class Operator3 {

    public static void main(String[] args) {
        String cold = "на улице холодно";
        String warm = "на улице тепло";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите тепмературу: ");
        int temperature = scanner.nextInt();
        if (temperature < 0) {
            System.out.println("на улице холодно");
        } else {
            System.out.println("на улице тепло");
        }
    }
}
