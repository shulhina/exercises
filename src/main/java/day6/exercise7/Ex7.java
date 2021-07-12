package day6.exercise7;

import java.util.HashMap;
import java.util.Map;

public class Ex7 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        System.out.println(map.keySet());
    }
}