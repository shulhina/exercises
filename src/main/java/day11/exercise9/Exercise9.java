package day11.exercise9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercise9 {
    public static void main(String[] args) {
        List<Integer> listOfGrades = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            listOfGrades.add(rand.nextInt(100) + 1);
        }
        listOfGrades.forEach(x -> {
            if (x >= 90) System.out.println(x + " A");
            else if (x >= 80) System.out.println(x + " B");
            else if (x >= 70) System.out.println(x + " C");
            else if (x >= 60) System.out.println(x + " D");
            else System.out.println(x + " F");
        });
    }
}
