package day6.ex2;

import java.util.ArrayList;

public class ex2 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("black");
        colors.add("white");
        colors.add("gray");
        colors.add("silver");
        colors.add("red");
        colors.add("green");
        System.out.println(colors);

        iterateList(colors);
    }

    public static void iterateList(ArrayList<String> arrayList) {
        for (String color : arrayList) {
            System.out.println(color);
        }
    }
}
