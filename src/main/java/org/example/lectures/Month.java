package org.example.lectures;

/**
 * Pеализуй метод getNextMonth(), который должен возвращать следующий месяц,
 * а если передан последний месяц, возвращать первый. Используй методы values и ordinal.
 */
public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;


    /*public static void main(String[] args) {
      *//*for (Month s : Month.values()) {
        System.out.println(s + " : " + s.ordinal());
      }*//*
        System.out.println(getNextMonth(Month.DECEMBER));
        System.out.println(getNextMonth(Month.JULY));
    }*/

    /*public static Month getNextMonth(Month month) {
        //напишите тут ваш код
        //return month;
        if (month.ordinal() != 11) {
            return Month.values()[month.ordinal() + 1];
        }
    }*/
}
