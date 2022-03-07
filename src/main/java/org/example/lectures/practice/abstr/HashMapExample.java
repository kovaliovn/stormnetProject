package org.example.lectures.practice.abstr;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Николай", 22);
        map.put("Александр", 21);
        map.put("Леноид", 20);
        map.put("Анна", null);

        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + " --> " + value);
        }
    }
}
