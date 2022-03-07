package org.example.lectures.practice.abstr;

public class Dog extends Animal {
    @Override
    public void display() {
        System.out.println("Hello from Dog.display");
    }

    @Override
    public void name() {
        System.out.println("Hello from Dog.name");
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.display();
        dog.name();
    }
}
