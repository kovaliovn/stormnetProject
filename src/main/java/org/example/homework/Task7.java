package org.example.homework;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        int countOfPositiveDigit = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое положительное число: ");
        int firstPositiveDigit = scanner.nextInt();
        System.out.print("Введите второе положительное число: ");
        int secondPositiveDigit = scanner.nextInt();
        System.out.print("Введите третее положительное число: ");
        int thirdPositiveDigit = scanner.nextInt();
        if (firstPositiveDigit > 0) {
            countOfPositiveDigit++;
        }
        if (secondPositiveDigit > 0) {
            countOfPositiveDigit++;
        }
        if (thirdPositiveDigit > 0) {
            countOfPositiveDigit++;
        }
        System.out.println(countOfPositiveDigit);
    }
}
