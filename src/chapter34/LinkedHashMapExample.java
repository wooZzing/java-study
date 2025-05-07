package chapter34;

import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("one", "하나");
        map.put("two", "둘");
        map.put("three", "셋");

        for (String key : map.keySet()) {
            System.out.println(key + " → " + map.get(key));
        }
    }
}