package org.example.homework;

import java.util.Objects;
import java.util.Scanner;

public class Task3 {

    private String processor;
    private String ram;
    private String hardDisk;
    private static final int fullCycleWork = 2;

    public static void main(String[] args) {
        setAndOutputAllFields("intel", "512mb", "512mb");
        manipulationWithComputer();
    }

    public Task3(String processor, String ram, String hardDisk) {
        this.processor = processor;
        this.ram = ram;
        this.hardDisk = hardDisk;
    }

    public String getProcessor() {
        return processor;
    }

    public String getRam() {
        return ram;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    private static void setAndOutputAllFields(String processor, String ram, String hardDisk) {
        Task3 comp = new Task3(processor, ram, hardDisk);

        System.out.println("Processor name is: " + comp.getProcessor());
        System.out.println("Amount of RAM is: " + comp.getRam());
        System.out.println("Amount of hard disk is: " + comp.getHardDisk());
        System.out.println("Count of full cycle to on computer is: " + fullCycleWork);
    }

    private static void manipulationWithComputer() {
        int min = 0;
        int max = 1;

        int randomInt = (int) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println("\nRandom value is: " + randomInt);
        String result = null;
        for (int i = 0; i < fullCycleWork; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input value to on computer: ");
            int firstName = scanner.nextInt();
            if (Objects.equals(result, "\nComputer crashed")) {
                System.out.println("Couldn't on computer. Game over!");
                break;
            }

            if (firstName == randomInt) {
                result = "\nComputer is off";
                System.out.println(result);
            }
            if (firstName != randomInt && !(firstName > max) && !(firstName < min)) {
                result = "\nComputer crashed";
                System.out.println(result);
            }
            if (firstName > max || firstName < min) {
                result = "\nThere has been a breakdown";
                System.out.println(result);
            }
        }
    }
}
