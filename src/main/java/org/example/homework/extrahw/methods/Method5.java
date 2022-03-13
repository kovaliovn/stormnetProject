package org.example.homework.extrahw.methods;

/**
 * Неплохо было бы иметь один метод для решения различных задач. У тебя есть возможность написать такой.
 * Создай еще 9 методов universalMethod(). В сумме их должно получиться 10.
 * Параметры, которые они должны принимать, придумай сам.
 * Требования:
 * •	Программа должна содержать 10 методов с именем universalMethod.
 */


public class Method5 {


    public static void main(String[] args) {
        universalMethod(" is present");
        universalMethod(" is present ", 1);
        universalMethod();
        universalMethod(1);
        universalMethod(1L);
        universalMethod('A');
        universalMethod(true);
        universalMethod(1d);
        universalMethod('A', true);
        universalMethod(1d, 1);
    }

    public static void universalMethod(String firstMethod) {
        System.out.println("first universalMethod" + firstMethod);
    }

    public static void universalMethod(String secondMethod, int time) {
        System.out.println("second universalMethod" + secondMethod + time + " раз");
    }

    public static void universalMethod() {
        System.out.println("Hello from empty universalMethod");
    }

    public static void universalMethod(int time) {
        System.out.println("fourth universalMethod " + time + " раз");
    }

    public static void universalMethod(long time) {
        System.out.println("fifth universalMethod " + time + " раз");
    }

    public static void universalMethod(char symbol) {
        System.out.println("sixth universalMethod contains " + symbol);
    }

    public static void universalMethod(boolean isJava) {
        System.out.println("seventh universalMethod is boolean " + isJava);
    }

    public static void universalMethod(double time) {
        System.out.println("ninth universalMethod is present " + time + " раз");
    }

    public static void universalMethod(char byteSize, boolean isJava) {
        System.out.println("tenth universalMethod is present " + byteSize + " раз " + isJava);
    }

    public static void universalMethod(double timeDouble, int time) {
        System.out.println("second universalMethod is present " + time + " раз" + " and is " + timeDouble);
    }
}
