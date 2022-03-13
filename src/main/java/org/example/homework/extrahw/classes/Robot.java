package org.example.homework.extrahw.classes;

public class Robot {

    public int robotCounter;

    public int id;

    public String model;

    public int productionYear;

    public static final String VENDOR = "Javarush Co.";

    public Robot(String model, int productionYear) {
        this.model = model;
        this.productionYear = productionYear;
        this.id = ++robotCounter;
    }

    public void displayInformation() {
        System.out.printf("Я %d-й из %d роботов. Модель: %s. Произведен компанией %s в %d году.\n",
                id, robotCounter, model, VENDOR, productionYear);
    }
}
