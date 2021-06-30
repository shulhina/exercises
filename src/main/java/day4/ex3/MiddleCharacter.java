package day4.ex3;

import java.util.Scanner;

public class MiddleCharacter {
    public static String middleCharacter(String input) {
        int lenByTwo = input.length() / 2;
        if (input.length() % 2 == 0) {
            return input.substring(lenByTwo - 1, lenByTwo + 1);
        } else {
            return input.substring(lenByTwo, lenByTwo + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        System.out.println("Middle character: " + middleCharacter(input));
    }
}
