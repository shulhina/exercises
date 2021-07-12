package day6.exercise8;

import java.util.*;

public class Ex8 {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap();
        treeMap.put("A", 1);
        treeMap.put("D", 4);
        treeMap.put("B", 2);
        treeMap.put("C", 3);

/*
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Key : (" + entry.getKey()
                    + "), Value : "
                    + entry.getValue());
        }
*/

        List<String> aList = new ArrayList<>(treeMap.keySet());

        StringReverseSortComparator stringReverseSortComparator = new StringReverseSortComparator();
        Collections.sort(aList, stringReverseSortComparator);
        System.out.println("Sorted keys:" + aList);
    }
}