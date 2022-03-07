package org.example.homework;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите любое целое число: ");
        int firstDigit = scanner.nextInt();
        System.out.print("Введите любое целое число: ");
        int secondDigit = scanner.nextInt();
        System.out.println(Math.max(firstDigit, secondDigit));
    }
}
