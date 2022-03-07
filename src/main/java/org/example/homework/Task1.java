package org.example.homework;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter last name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter first name: ");
        String secondName = scanner.nextLine();
        System.out.print("Enter middle name: ");
        String thirdName = scanner.nextLine();
        System.out.println("Full name: " + firstName + " " + secondName + " " + thirdName);
        scanner.close();
    }
}
