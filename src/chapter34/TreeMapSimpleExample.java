package chapter34;

import java.util.*;

public class TreeMapSimpleExample {
    public static void main(String[] args) {
        // 1. 기본 TreeMap (오름차순 정렬)
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(30, "삼십");
        map.put(10, "열");
        map.put(20, "이십");

        System.out.println("기본 정렬 (오름차순):");
        for (Integer key : map.keySet()) {
            System.out.println(key + " → " + map.get(key));
        }

        // 2. 정렬 커스터마이징 (내림차순 정렬)
        TreeMap<Integer, String> reversedMap = new TreeMap<>(Comparator.reverseOrder());
        reversedMap.putAll(map);

        System.out.println("\n커스텀 정렬 (내림차순):");
        for (Integer key : reversedMap.keySet()) {
            System.out.println(key + " → " + reversedMap.get(key));
        }

        // 3. 범위 조회
        System.out.println("\n범위 조회:");
        System.out.println("headMap(20): " + map.headMap(20));        // 20보다 작은 key
        System.out.println("tailMap(20): " + map.tailMap(20));        // 20 이상인 key
        System.out.println("subMap(10, 30): " + map.subMap(10, 30));  // 10 이상 30 미만
    }
}