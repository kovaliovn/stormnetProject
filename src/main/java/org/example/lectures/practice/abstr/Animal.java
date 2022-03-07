package org.example.lectures.practice.abstr;

public abstract class Animal {
    String cat;
    String dog;
    String cow;

    public String getCat() {
        return cat;
    }

    public Animal(String cat, String dog, String cow) {
        this.cat = cat;
        this.dog = dog;
        this.cow = cow;
    }

    public abstract void display();

    public abstract void name();

    public String getDog() {
        return dog;
    }

    public Animal() {
        //empty constructor
    }

    public String getCow() {
        return cow;
    }
}
