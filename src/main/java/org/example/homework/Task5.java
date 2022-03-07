package org.example.homework;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину первой стороны треугольника: ");
        a = scanner.nextInt();
        System.out.print("Введите длину второй стороны треугольника: ");
        b = scanner.nextInt();
        System.out.print("Введите длину третьей стороны треугольника: ");
        c = scanner.nextInt();
        if (a > 0 && b > 0 && c > 0) {
            if (a + b > c && b + c > a && c + a > b) {
                System.out.println("Треугольник существует");
            } else {
                System.out.println("Такого треугольника не существует");
            }
        } else {
            System.out.println("Такого треугольника не существует");
        }
    }
}
