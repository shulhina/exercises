package day4.exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        UserMainCode example = new UserMainCode();

        if (example.checkCharacters(input) == 1) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
        scan.close();
    }
}
