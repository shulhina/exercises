package day11.ex8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Ex8 {
    public static void main(String[] args) {
        List<Character> listOfRandomCharacters = new ArrayList<>();
        Random r = new Random();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
        for (int i = 0; i < 30; i++) {
            listOfRandomCharacters.add(alphabet.charAt(r.nextInt(alphabet.length())));
        }

        System.out.println("Sorting the List in ascending order: ");
        listOfRandomCharacters
                .stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("\nSorting the List in descending  order: ");
        listOfRandomCharacters
                .stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        System.out.println("\nDisplaying the List in ascending order with duplicates removed: ");
        listOfRandomCharacters
                .stream()
                .sorted()
                .distinct()
                .forEach(System.out::println);
    }
}
