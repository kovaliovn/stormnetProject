package org.example.homework.extrahw.array_list;

/**
 * Перед тобой программа, которая сортирует элементы списка по возрастанию методом "пузырька"(гуглим что то такое).
 * Перепиши код, чтобы вместо списка ArrayList<Integer> numbers использовался массив int[] numbers.
 * Методы main() и print() не принимают участие в проверке.
 * Требования:
 * •	Поле numbers должно быть типа int[].
 * •	Поле numbers должно инициализироваться десятью числами при создании.
 * •	Метод sort() должен сортировать элементы массива int[] numbers по возрастанию.
 */

public class List1 {

    public static int[] numbers = new int[] {56, 45, 89, 1, 45, 13, 4, 69, 11, -89};

    public static void main(String[] args) {
        print();
        sort();
        System.out.println("\nОтсортированные числа в натуральном порядке:");
        print();
    }

    public static void sort() {
        for (int i = 0; i < numbers.length - 1; i++) {
            int min = numbers[i];
            int min_i = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    min_i = j;
                }
            }

            if (i != min_i) {
                int tmp = numbers[i];
                numbers[i] = numbers[min_i];
                numbers[min_i] = tmp;
            }
        }
    }

    public static void print() {
        for (int number : numbers) {
            System.out.print(number + "\t");
        }
    }
}
