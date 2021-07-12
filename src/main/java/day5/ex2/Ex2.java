package day5.ex2;

import java.util.Scanner;

// the same as day4.day6.day9.day11.ex1.day9.day11.ex1

public class Ex2 {
    /**
     * Determines if a user input string is a palindrome
     * (string that has the same value if it is reversed).
     *
     * @param input string that need checking for palindromic
     * @return 1 if valid, 0 if invalid
     */
    // didn't complete yet
    public boolean checkCharacters(String input) {
        int falseIterator = 0;
        int lenByTwo;
        if (input.length() % 2 == 0) {
            lenByTwo = input.length() / 2;
        } else {
            lenByTwo = input.length() / 2 + 1;
        }
        for (int i = 0; i <= lenByTwo; i++) {
            if (!input.substring(i, i + 1).equals(input.substring(input.length() - 1 - i))) {
                falseIterator++;
            }
        }
        return falseIterator == 0;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        Ex2 ex = new Ex2();

        if (ex.checkCharacters(input)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
        scan.close();

    }
}
