package day11.ex7;

import java.util.Arrays;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your sentence: ");
        String sentence = sc.nextLine();
        System.out.println("Sentence :" + sentence);
        String[] sentenceList = sentence.split(" ");
        Arrays.stream(sentenceList)
                .distinct()
                .forEach(System.out::println);
    }
}

