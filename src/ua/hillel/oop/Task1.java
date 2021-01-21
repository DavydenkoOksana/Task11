package ua.hillel.oop;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        String[] array = {"aa", "b", "ccc", "aa", "ccc"};
        Map<String, Integer> map = new HashMap<>();
        for (String element : array) {
            if (map.containsKey(element)) {
                map.put(element, map.get(element) + 1);
            } else {
                map.put(element, 1);
            }
        }
        System.out.println(map);
    }
}
