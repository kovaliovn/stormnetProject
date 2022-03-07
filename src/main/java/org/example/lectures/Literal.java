package org.example.lectures;

public class Literal {
    public static void main(String[] args) {
        //Четыре типа:
        //Числовые
        // - целочисленные
        //byte, short, int, long;
        int qwe = 45;
        System.out.println(qwe);
        // - целочисленные с плавающей точкой
        //float, double
        double a = 2.77777777; //24 значения после точки
        System.out.println(a);
        double b = 4.05E-13;
        System.out.println(b);
        float c = 4.05E-13F; // 6 значений после точки
        System.out.println(c);

        //Запомнить, что выведится int (4 байта памяти)
        byte aq = 4;
        short cq = 6;
        System.out.println(aq + cq);

        //Строковые литералы
        String simpleString = "Обычная строка";
        String uniqueString = "Уникальная строка";
        int as = 4;
        int bs = 6;
        System.out.println(as + bs);
        System.out.println(uniqueString);
        System.out.println(simpleString);

        //Символьные литералы
        //char, объявляется через одинарную ковычку
        char f = 102;
        System.out.println(f);
        System.out.println("Амперсанд: - " + '&');
        System.out.println("Символ деления: - " + '\u002f');

        //Integer method
        int number = Integer.parseInt("123");
        System.out.println(number + 77);

        String literal = "Java";
        System.out.println("Длина слова Java: " + literal.length());
        System.out.println("lower case: " + literal.toLowerCase());
        System.out.println("upper case: " + literal.toUpperCase());

        final double pi = 3.14;

        int aqq = 5;
        int bqq = 2;
        System.out.println( (float) aqq / bqq);

        //Логические литералы
        //boolean - true, false
        boolean flag = false;

        if (!flag) {
            System.out.println("flag is true");
        }

        /*
        Многострочный комментарий
         */

        /**
         * {@inheritDoc}
         */
        System.out.println("javadoc");
    }
}
