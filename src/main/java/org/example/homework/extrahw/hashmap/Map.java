package org.example.homework.extrahw.hashmap;

import java.util.HashMap;

/**
 * В классе Map объявлено поле grades типа HashMap<String, Double>, где ключ — имя и фамилия студента, а значение - его
 * средняя оценка.
 * Твоя задача — реализовать метод addStudents, который добавит 5 студентов с их средней оценкой в коллекцию grades.
 * Значения можешь выбрать любые.
 * Требования:
 * •	В классе Map нужно инициализировать публичное статическое поле grades типа HashMap<String, Double>.
 * •	В классе Map должен быть публичный статический метод addStudents с типом возвращаемого значения void.
 * •	Метод addStudents должен добавлять 5 студентов со средней оценкой в поле grades.
 */
public class Map {

    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
    }

    public static void addStudents() {
        grades.put("Ivan", 8.0);
        grades.put("Nick", 7.0);
        grades.put("Fedor", 6.0);
        grades.put("Glenn", 10.0);
        grades.put("Stephan", 9.0);

        for (String key : grades.keySet()) {
            Double value = grades.get(key);
            System.out.println(key + " --> " + value);
        }

        double avgResult = 0;

        for (Double value : grades.values()) {
            avgResult += value / grades.size();
        }
        System.out.println();
        System.out.println("Средняя оценка всех студентов: " + avgResult);
    }
}
