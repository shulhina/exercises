package day6.exercise3;

import java.util.ArrayList;
import java.util.Collections;

public class Ex3 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("black");
        colors.add("white");
        colors.add("gray");
        colors.add("silver");
        colors.add("red");
        colors.add("green");
        System.out.println(colors);

        System.out.println("\nOriginal list:");
        iterateList(colors);

        System.out.println("\nReversed list method:");
        iterateList(reverseList(colors));

        System.out.println("\nReversed list reverse in collections:");
        Collections.reverse(colors);
    }

    public static ArrayList<String> reverseList(ArrayList<String> arrayList) {
        ArrayList<String> reversedList = new ArrayList<>();
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            reversedList.add(arrayList.get(i));
        }
        return reversedList;
    }

    public static void iterateList(ArrayList<String> arrayList) {
        for (String color : arrayList) {
            System.out.println(color);
        }
    }
}