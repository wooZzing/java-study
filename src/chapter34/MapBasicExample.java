package chapter34;

import java.util.*;

public class MapBasicExample {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();
        countries.put("KR", "대한민국");
        countries.put("US", "미국");
        countries.put("JP", "일본");

        System.out.println(countries.get("KR")); // 대한민국
    }
}