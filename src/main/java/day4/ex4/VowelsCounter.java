package day4.ex4;

import java.util.Scanner;

public class VowelsCounter {
    public static int countVowels(String input) {
        return input.replaceAll("[^aeiouAEIOU]", "").length();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        scan.close();

        System.out.println("Number of Vowels in the string: " + countVowels(input));
    }
}
