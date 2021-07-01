package day5.ex2;

import java.util.Scanner;

// the same as day4.ex1

public class Ex2 {
    /**
     * Determines if a user input string is a palindrome
     * (string that has the same value if it is reversed).
     *
     * @param input string that need cheeking for palindromic
     * @return 1 if valid, 0 if invalid
     */
    public int checkCharacters(String input) {
        if (input.substring(0, 1).equals(input.substring(input.length() - 1))) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        Ex2 ex = new Ex2();

        if (ex.checkCharacters(input) == 1) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
        scan.close();

    }
}
