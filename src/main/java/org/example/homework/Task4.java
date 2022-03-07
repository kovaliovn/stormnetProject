package org.example.homework;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long firstName = scanner.nextLong();
        long count = String.valueOf(Math.abs(firstName)).length();
        if (firstName == 0) {
            System.out.println("Это число не является ни положительным, ни отрицательным");
        }
        if (firstName > 0) {
            System.out.println("Число положительное и " + count + "-значное");
        }
        if (firstName < 0) {
            System.out.println("Число отрицательное и " + count + "-значное");
        }
    }
}
