package org.example.homework;

import java.util.Scanner;

public class Task2 {

    private static final int DISCOUNT_PERCENT = 10;

    public static void main(String[] args) {
        String[] goods = new String[3];
        float[] price = new float[3];
        int sum = 0;
        int discountAmount = 0;
        int resultantPrice = 0;
        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Название товара: ");
            goods[i] = scanner.nextLine();
            System.out.print("Цена: ");
            price[i] = scanner.nextFloat();
        }
        System.out.println();
        System.out.println(goods[0] + " " + price[0]);
        System.out.println(goods[1] + " " + price[1]);
        System.out.println(goods[2] + " " + price[2]);

        System.out.println("*************************");

        for (float v : price) {
            sum = (int) (sum + v);
        }
        System.out.println("Общая стоимость: " + sum);

        discountAmount = sum / DISCOUNT_PERCENT;
        System.out.println("Размер скидки: " + discountAmount);

        resultantPrice = sum - discountAmount;
        System.out.println("Стоимость с учетом скидки: " + resultantPrice);
    }
}
