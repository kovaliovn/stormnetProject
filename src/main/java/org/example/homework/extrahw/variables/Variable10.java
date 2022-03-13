package org.example.homework.extrahw.variables;

import java.util.Scanner;

/**
 * Напиши программу, которая считывает с клавиатуры два вещественных числа (double) и выдает сообщение о том, равны ли
 * эти числа с точностью до одной миллионной.
 * Требования:
 * •	Программа должна считывать два числа c клавиатуры.
 * •	Если числа равны, то программа должна вывести сообщение "числа равны".
 * •	Если числа не равны, то программа должна вывести сообщение "числа не равны".
 * •	Точность сравнения должна достигать одной миллионной (0.000001).
 */

public class Variable10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double secondNumber = scanner.nextDouble();
        if (firstNumber == secondNumber) {
            System.out.println("числа равны");
        } else {
            System.out.println("числа не равны");
        }
    }
}
