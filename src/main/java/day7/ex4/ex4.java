package day7.ex4;

import java.util.Scanner;

class InvalidAgeRange extends Exception {
    InvalidAgeRange(String s) {
        super(s);
    }
}

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            inputValidation(age, name);
        } catch (InvalidAgeRange invalidAgeRange) {
            invalidAgeRange.printStackTrace();
        }
    }

    public static void inputValidation(int age, String name) throws InvalidAgeRange {
        if (age <= 19) {
            throw new InvalidAgeRange("The player's age is below 19");
        } else {
            System.out.println("Player name : " + name +
                    "\n" +
                    "Player age : " + age);
        }
    }
}

