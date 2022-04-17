package org.example.homework.extrahw.oop.interfaces;

/**
 * Классы Car и Bus имплементируют интерфейс Vehicle. При этом имплементации некоторых его методов у них сходятся.
 * Реализуй эти методы как default в самом интерфейсе Vehicle, а из классов Car и Bus их убери.
 * Требования:
 * •	Интерфейс Vehicle должен реализовывать метод default void start().
 * •	Интерфейс Vehicle должен реализовывать метод default void stop().
 * •	Класс Car не должен имплементировать методы void start() и void stop().
 * •	Класс Bus не должен имплементировать методы void start() и void stop().
 */

public class Inheritance9 {

    public interface Vehicle {

        default void start() {
            System.out.println("Начинаю движение.");
        }

        default void stop() {
            System.out.println("Останавливаюсь.");
        }

        void move();
    }

    public class Car implements Vehicle {

        public void move() {
            System.out.println("Еду со средней скоростью 70 км/ч.");
        }
    }

    public class Bus implements Vehicle {

        public void move() {
            System.out.println("Еду со средней скоростью 50 км/ч.");
        }
    }
}
