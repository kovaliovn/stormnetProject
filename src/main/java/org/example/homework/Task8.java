package org.example.homework;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        int countOfNegativeDigit = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое отрицательное число: ");
        int firstNegativeDigit = scanner.nextInt();
        System.out.print("Введите второе отрицательное число: ");
        int secondNegativeDigit = scanner.nextInt();
        System.out.print("Введите третее отрицательное число: ");
        int thirdNegativeDigit = scanner.nextInt();
        if (firstNegativeDigit < 0) {
            countOfNegativeDigit++;
        }
        if (secondNegativeDigit < 0) {
            countOfNegativeDigit++;
        }
        if (thirdNegativeDigit < 0) {
            countOfNegativeDigit++;
        }
        System.out.println(countOfNegativeDigit);
    }
}
