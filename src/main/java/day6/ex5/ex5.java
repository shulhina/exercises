package day6.ex5;

import java.util.TreeSet;

public class ex5 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(9);
        treeSet.add(6);
        treeSet.add(8);
        treeSet.add(7);
        treeSet.add(4);

        System.out.println("\nOriginal list:");
        iterateTree(treeSet);

        System.out.println("Lover than 7:" + treeSet.headSet(7));
    }

    public static void iterateTree(TreeSet<Integer> treeSet) {
        for (int instance : treeSet) {
            System.out.println(instance);
        }
    }
}
