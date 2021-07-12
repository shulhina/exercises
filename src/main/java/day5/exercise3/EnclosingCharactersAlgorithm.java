package day5.exercise3;

import java.util.HashMap;
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
            HashMap<String, Integer> count = new HashMap<>();
            count.put("{", 0);
            count.put("(", 0);
            count.put("[", 0);
            count.put("<", 0);

            for (String instance : stringArray) {
                if (instance.matches("[{(\\[<]")) {
                    switch (instance) {
                        case "{":
                            count.put("{", count.get("{") + 1);
                            break;
                        case "(":
                            count.put("(", count.get("(") + 1);
                            break;
                        case "[":
                            count.put("[", count.get("[") + 1);
                            break;
                        case "<":
                            count.put("<", count.get("<") + 1);
                            break;
                    }
                } else {
                    switch (instance) {
                        case "}":
                            if (count.get("{") == 0) {
                                return false;
                            } else {
                                count.put("{", count.get("{") - 1);
                                break;
                            }
                        case ")":
                            if (count.get("(") == 0) {
                                return false;
                            } else {
                                count.put("(", count.get("(") - 1);
                                break;
                            }
                        case "]":
                            if (count.get("[") == 0) {
                                return false;
                            } else {
                                count.put("[", count.get("[") - 1);
                                break;
                            }
                        case ">":
                            if (count.get("<") == 0) {
                                return false;
                            } else {
                                count.put("<", count.get("<") - 1);
                                break;
                            }
                    }
                }
            }
            return count.get("{").equals(0)
                    && count.get("(").equals(0)
                    && count.get("[").equals(0)
                    && count.get("<").equals(0);
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