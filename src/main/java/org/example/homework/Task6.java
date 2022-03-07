package org.example.homework;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int digit = scanner.nextInt();
        if (digit > 0) {
            digit++;
        }
        if (digit < 0) {
            digit -= 2;
        }
        if (digit == 0) {
            digit = 10;
        }
        System.out.println(digit);
    }
}
