package org.example.homework.extrahw.oop.poliformism;

/**
 * В этой задаче тебе предстоит создать универсальный инструмент для поиска минимальных и максимальных чисел.
 * В классе Overloading создай публичные статические методы min() и max(),
 * которые в качестве аргументов принимают целочисленные (тип int) значения и возвращают минимальное и максимальное из
 * них соответственно.
 * <p>
 * Каждый из методов должен быть перегружен так, чтобы была возможность вызвать метод с двумя, тремя, четырьмя и пятью
 * параметрами.
 * В общем, необходимо создать 8 методов, — 4 для min() и 4 для max().
 * Все аргументы методов должны быть типа int.
 * Требования:
 * •	В классе Overloading должно быть создано 4 перегруженных метода min() в соответствии с условием задания.
 * •	В классе Overloading должно быть создано 4 перегруженных метода max() в соответствии с условием задания.
 * •	Методы min() должны возвращать минимальное из переданных чисел.
 * •	Методы max() должны возвращать максимальное из переданных чисел.
 */

public class Overloading {

    public static void main(String[] args) {
        min(10, 5);
        max(10, 20);
    }

    public static int min(int minValueOne, int minValueTwo, int minValueThree, int minValueFour, int minValueFive) {
        int firstCompare = Math.min(minValueOne, Math.min(minValueTwo, minValueThree));
        int secondCompare = Math.min(minValueFour, minValueFive);
        int result = Math.min(firstCompare, secondCompare);
        System.out.println(result);
        return result;
    }

    public static int min(int minValueOne, int minValueTwo, int minValueThree, int minValueFour) {
        return min(minValueOne, minValueTwo, minValueThree, minValueFour, Integer.MAX_VALUE);
    }

    public static int min(int minValueOne, int minValueTwo, int minValueThree) {
        return min(minValueOne, minValueTwo, minValueThree, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    public static int min(int minValueOne, int minValueTwo) {
        return min(minValueOne, minValueTwo, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    public static int max(int maxValueOne, int maxValueTwo, int maxValueThree, int maxValueFour, int maxValueFive) {
        int firstCompare = Math.max(maxValueOne, Math.max(maxValueTwo, maxValueThree));
        int secondCompare = Math.max(maxValueFour, maxValueFive);
        int result = Math.max(firstCompare, secondCompare);
        System.out.println(result);
        return result;
    }

    public static int max(int maxValueOne, int maxValueTwo, int maxValueThree, int maxValueFour) {
        return max(maxValueOne, maxValueTwo, maxValueThree, maxValueFour, Integer.MIN_VALUE);
    }

    public static int max(int maxValueOne, int maxValueTwo, int maxValueThree) {
        return max(maxValueOne, maxValueTwo, maxValueThree, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public static int max(int maxValueOne, int maxValueTwo) {
        return max(maxValueOne, maxValueTwo, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}
