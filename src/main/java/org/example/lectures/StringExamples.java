package org.example.lectures;

public class StringExamples {

    public static void main(String[] args) {
        String s = "Hello";
        String str = "World";
        System.out.println(s.concat(str));
        String str3 = String.join("-----------", s, str);
        System.out.println(str3);
        char char1 = str.charAt(3);
        System.out.println(char1);

        boolean result = s.regionMatches(1, str, 2, 2);
        System.out.println(result);
    }
}
