package chapter34;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, String> capitals = new HashMap<>();
        capitals.put("Korea", "Seoul");
        capitals.put("USA", "Washington");
        capitals.put("Japan", "Tokyo");

        System.out.println("USA 수도: " + capitals.get("USA"));

        for (String key : capitals.keySet()) {
            System.out.println(key + " → " + capitals.get(key));
        }
    }
}