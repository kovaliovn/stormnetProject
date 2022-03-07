package org.example.lectures;

//Спецсимволы
public class SpecSymbol {

    public SpecSymbol(String name) {
        System.out.println(name);
    }

    private static void test() {
        System.out.println("test method");
    }

    public static void main(String[] args) {
        //перенос строки
        System.out.println("Hello\nWorld");
        //табуляция
        System.out.println("Hello\n\tWorld");
        //экранизация
        System.out.println("Hello \"World\"");
    }
}
