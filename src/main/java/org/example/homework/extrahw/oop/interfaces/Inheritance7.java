package org.example.homework.extrahw.oop.interfaces;

/**
 * Настоящий артист должен уметь развлечь людей. И танцы, и пение — это часть развлечения.
 * Перед тобой 3 интерфейса:
 * Dance — танцующий,
 * Sing — поющий,
 * Artist — артист.
 * <p>
 * Продумай, какая структура наследования подойдет этим интерфейсам. Унаследуй один интерфейс от двух других.
 * Требования:
 * •	Один интерфейс должен наследоваться от двух других.
 */

public class Inheritance7 {

    public interface Sing {
    }

    public interface Dance {
    }

    public interface Artist extends Sing, Dance {
    }
}
