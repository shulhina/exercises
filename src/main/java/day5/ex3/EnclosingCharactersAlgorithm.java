package day5.ex3;

import java.util.Scanner;

public class EnclosingCharactersAlgorithm {

    /**
     * Checks if or every opening parenthesis, brace, bracket or
     * similar type there must be a corresponding closing type.
     *
     * @param input string that need checking
     * @return true if valid, false if invalid
     */
    public static boolean checkCharacters(String input) {
        String[] stringArray = input.split("");
        if (stringArray[0].matches("[)}\\]>]")) {
            return false;
        } else {
            int counter = 0;
            for (String instance : stringArray) {
                if (instance.matches("[{(\\[<]")) {
                    counter++;
                } else {
                    counter--;
                }
            }
            return counter == 0;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        System.out.println("Input:" + input);

        if (checkCharacters(input)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
        scan.close();
    }
}


