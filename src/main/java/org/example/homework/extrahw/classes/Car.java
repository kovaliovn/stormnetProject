package org.example.homework.extrahw.classes;

/**
 * В далеком-далеком прошлом все машины называли одинаково. Но вот в один прекрасный день директору завода по
 * производству автомобилей надоело однообразие,
 * и он выдал распоряжение: давать разные названия моделям авто.
 * Итак, как ты уже догадался, твоя задача — помочь главному инженеру исправить программу по производству машин так,
 * чтобы каждому объекту-машине можно было присвоить уникальное имя.
 * Требования:
 * •	Поле modelName класса Car должно быть не статическим.
 * •	Должны быть исправлены геттер и сеттер для поля modelName.
 */


public class Car {
    private String modelName;
    private int speed;

    public static void main(String[] args) {
        Car bmw = new Car();
        Car toyota = new Car();
        bmw.setModelName("BMW");
        toyota.setModelName("TOYOTA");
        bmw.setSpeed(120);
        toyota.setSpeed(140);
    }

    public Car() {
        //empty constructor
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
        System.out.println("Название модели автомобился: " + getModelName());
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("Скорость " + getModelName() + " равна " + getSpeed() + " в км/ч");
    }
}
