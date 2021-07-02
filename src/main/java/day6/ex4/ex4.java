package day6.ex4;

import java.util.HashSet;

public class ex4 {
    public static void main(String[] args) {
        HashSet<String> setColors1 = new HashSet<>();
        setColors1.add("black");
        setColors1.add("white");
        setColors1.add("gray");
        setColors1.add("silver");
        setColors1.add("red");
        setColors1.add("green");

        HashSet<String> setColors2 = new HashSet<>();
        setColors2.add("black");
        setColors2.add("yellow");
        setColors2.add("gray");
        setColors2.add("purple");
        setColors2.add("red");
        setColors2.add("aqua");

        setColors1.retainAll(setColors2);
        iterateHashSet(setColors1);

    }

    public static void iterateHashSet(HashSet<String> hashSet) {
        for (String color : hashSet) {
            System.out.println(color);
        }
    }

}

