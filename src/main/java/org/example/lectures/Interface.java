package org.example.lectures;

public class Interface {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.move();
    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public static class Dog implements CanEat, CanMove {

        @Override
        public void eat() {
            System.out.println("Dog can eat");
        }

        @Override
        public void move() {
            System.out.println("Dog can move");
        }
    }

    public class Duck implements CanFly, CanEat, CanMove {
        @Override
        public void fly() {
            System.out.println("Duck can fly");
        }

        @Override
        public void move() {
            System.out.println("Duck can move");
        }

        @Override
        public void eat() {
            System.out.println("Duck can eat");
        }
    }

    public class Car implements CanMove {
        @Override
        public void move() {
            System.out.println("Car can move");
        }
    }

    public class Airplane implements CanFly, CanMove {
        @Override
        public void fly() {
            System.out.println("Airplane can fly");
        }

        @Override
        public void move() {
            System.out.println("Airplane can move");
        }
    }
}
