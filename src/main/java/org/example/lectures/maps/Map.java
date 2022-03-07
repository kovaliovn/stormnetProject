package org.example.lectures.maps;
/*
Успеваемость студентов
*/

import java.util.HashMap;

public class Map {

    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        printStudents();
        addStudents();
    }

    public static void addStudents() {
        grades.put("Иванов Иван", 8.0);

        for (String key : grades.keySet()) {
            Double value = grades.get(key);
            System.out.println(key + " --> " + value);
        }
    }

    /**
     * Метод printStudents должен выводить всех студентов (имя и фамилия) из коллекции grades с новой строки.
     */
    public static void printStudents() { // Список студентов группы: ...
        grades.put("Ильин Николай", 8.3);
        grades.put("Ажаронок Виталий", 8.4);
        grades.put("Тимошенко Василий", 8.4);
        grades.put("Салачёнок Ольга ", 8.5);
        grades.put("Клевко Дмитрий", 8.1);
        grades.put("Бричковская Ирина", 8.2);
        grades.put("Ковалев Никита", 8.5);
        grades.put("Шаршун Светлана", 8.4);
        grades.put("Шукалович Наталья", 8.3);
    }

    /**
     * Метод getAverageMark должен возвращать средний балл всех студентов из коллекции grades.
     *
     * @return который возвращает средний балл всех студентов.
     */
    public static Double getAverageMark() { // Средний балл группы: ....
        return null; //напишите тут ваш код
    }

    /**
     * Метод printStudentsInfo должен выводить текст в консоли
     * вывод будет следующим: Андрей Петров : 4.5
     * ...
     */
    public static void printStudentsInfo() {
        //напишите тут ваш код
    }
}
