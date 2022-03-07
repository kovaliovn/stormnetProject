package org.example.lectures.practice.abstr;

public class Cat extends Animal {
    @Override
    public void display() {
        System.out.println("Hello from Cat.display");
    }

    @Override
    public void name() {
        System.out.println("Hello from Cat.name");
    }

    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.display();
        cat.name();
    }
}
