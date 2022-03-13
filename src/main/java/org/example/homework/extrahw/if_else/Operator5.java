package org.example.homework.extrahw.if_else;

import java.util.Scanner;

/**
 * Ввести с клавиатуры три целых числа. Определить, есть ли среди них хотя бы одна пара равных между собой чисел.
 * Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все
 * три.
 * <p>
 * Примеры:
 * a) при вводе чисел 1 2 2 получим вывод 2 2
 * <p>
 * b) при вводе чисел 2 2 2 получим вывод 2 2 2
 * Требования:
 * •	Программа должна считывать три числа c клавиатуры.
 * •	Программа должна содержать System.out.println() или System.out.print()
 * •	Если два числа равны между собой, необходимо вывести их на экран.
 * •	Если все три числа равны между собой, необходимо вывести все три.
 * •	Если нет равных чисел, ничего не выводить.
 */

public class Operator5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Введите целое число: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Введите целое число: ");
        int thirdNumber = scanner.nextInt();
        if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber);
        } else if (firstNumber == secondNumber) {
            System.out.println(firstNumber + " " + secondNumber);
        } else if (firstNumber == thirdNumber) {
            System.out.println(firstNumber + " " + thirdNumber);
        }
    }
}
