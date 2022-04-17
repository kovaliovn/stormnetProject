package org.example.homework.extrahw.oop.interfaces;

/**
 * Классы Eagle (Орел), Raven (Ворон) и Aircraft (Самолет) имплементируют интерфейс Flyable,
 * который содержит дефолтную реализацию метода int getMaxSpeed() и возвращает значение 80.
 * Такая реализация неправильная, так как реальная максимальная скорость Орла — 180 км/ч, Ворона — 48, а самолета —
 * 1200.
 * <p>
 * Тебе нужно убрать дефолтную реализацию метода getMaxSpeed() из интерфейса Flyable (сам метод нужно оставить) и
 * имплементировать его в каждом из классов.
 * Для каждого класса укажи правильное значение максимальной скорости.
 * Требования:
 * •	Метод int getMaxSpeed() интерфейса Flyable не должен быть default.
 * •	Метод int getMaxSpeed() класса Eagle должен возвращать 180.
 * •	Метод int getMaxSpeed() класса Raven должен возвращать 48.
 * •	Метод int getMaxSpeed() класса Aircraft должен возвращать 1200.
 */

public class Inheritance10 {

    public interface Flyable {
        int getMaxSpeed();
    }

    public class Aircraft implements Flyable {
        @Override
        public int getMaxSpeed() {
            return 1200;
        }
    }

    public class Eagle implements Flyable {
        @Override
        public int getMaxSpeed() {
            return 180;
        }
    }

    public class Raven implements Flyable {
        @Override
        public int getMaxSpeed() {
            return 40;
        }
    }
}
