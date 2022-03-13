package org.example.homework.extrahw.variables;

/**
 * В переменной centimeters записано количество сантиметров.
 * В переменную meters нужно записать количество полных метров в centimeters (1 метр = 100 см).
 * Для вычисления используй переменную centimeters и оператор деления.
 * Для объявления и инициализации meters используй одну команду.
 * Требования:
 * •	Не изменяй значение переменной centimeters.
 * •	Для вычисления meters должны использоваться centimeters и оператор деления.
 * •	Программа должна выводить на экран значение переменной meters.
 */

public class Variable2 {

    private static final int CENTIMETERS_IN_ONE_METERS = 100;

    public static void main(String[] args) {
        int centimeters = 243;

        double meters = (double) centimeters / CENTIMETERS_IN_ONE_METERS;

        System.out.println(meters);
    }
}
