package chapter35;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {
    public static void main(String[] args) {
        Vector<String> fruits = new Vector<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        Enumeration<String> e = fruits.elements();

        while (e.hasMoreElements()) {
            String fruit = e.nextElement();
            System.out.println(fruit);
        }
    }
}