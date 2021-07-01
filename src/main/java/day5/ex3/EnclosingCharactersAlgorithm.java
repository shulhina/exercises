package day5.ex3;

import java.util.Scanner;

public class EnclosingCharactersAlgorithm {

    public static int checkCharacters(String[] input) {
        if (input[0].matches("[)}\\]>]")) {
            return 1;
        } else {
            int counter = 0;
            for (String instance : input) {
                if (instance.matches("[{(\\[<]")) {
                    counter++;
                } else {
                    counter--;
                }
            }
            return counter;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        System.out.println("Input:" + input);

        if (checkCharacters(input.split("")) == 0) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

    }
}


