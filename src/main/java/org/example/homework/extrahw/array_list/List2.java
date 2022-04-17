package org.example.homework.extrahw.array_list;

import java.util.ArrayList;

/**
 * В классе List2 есть метод printStudentNames(ArrayList), который принимает список объектов и выводит их имена.
 * Но на данный момент программа не компилируется.
 * Твоя задача исправить этот баг. Для этого нужно исправить сигнатуру метода printStudentNames(ArrayList), чтобы он
 * принимал список объектов только типа Student(используй дженерик).
 * Метод main не участвует в проверке.
 * Требования:
 * •	Исправь сигнатуру метода printStudentNames, чтобы он принимал список только студентов.
 * •	Реализацию метода printStudentNames не изменять.
 */

public class List2 {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Акакий"));
        students.add(new Student("Любослав"));

        printStudentNames(students);
    }

    public static void printStudentNames(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}
