package day6.ex8;

import java.util.Map;
import java.util.TreeMap;

public class ex8 {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap();
        treeMap.put("A", 1);
        treeMap.put("D", 4);
        treeMap.put("B", 2);
        treeMap.put("C", 3);

        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Key : (" + entry.getKey()
                    + "), Value : "
                    + entry.getValue());
        }
    }
}