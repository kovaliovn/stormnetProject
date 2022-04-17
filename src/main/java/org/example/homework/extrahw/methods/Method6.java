package org.example.homework.extrahw.methods;

import java.util.Objects;

/**
 * Перед тобой метод signIn(), который приветствует пользователей сайта. Сейчас он приветствует всех пользователей, а
 * должен только зарегистрированных.
 * Имена всех незарегистрированных пользователей — "user".
 * Добавь проверку имени пользователя в начало метода signIn().
 * Если имя "user", прерви выполнение метода, используя ключевое слово return.
 * Требования:
 * •	Если имя пользователя "user", метод signIn() должен прекратить работу, не выводя ничего в консоли.
 * •	Если имя пользователя не "user", метод signIn() должен продолжать работу и вывести строки приветствия в
 * консоли.
 * •	Для прерывания работы метода signIn() должно использоваться ключевое слово return.
 */


public class Method6 {

    public static void main(String[] args) {
        signIn("stormnet");
    }

    public static String signIn(String username) {
        if (Objects.equals(username, "user")) {
            return username;
        } else {
            System.out.println("Добро пожаловать " + username);
            System.out.println("Очень скучали по Вам, " + username);
        }
        return username;
    }
}
