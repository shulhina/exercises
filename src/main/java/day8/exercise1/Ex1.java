package day8.exercise1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Which exception you want to catch? (A, B, C) ");
            String exceptionName = sc.next();
            switch (exceptionName) {
                case "C":
                    throw new ExceptionC("Exception C was thrown");
                case "B":
                    throw new ExceptionB("Exception B was thrown");
                case "A":
                    throw new ExceptionA("Exception A was thrown");
                default:
                    throw new Exception("Your choice is wrong!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            if (e instanceof ExceptionC) {
                System.out.println("Exception C was caught");
            } else if (e instanceof ExceptionB) {
                System.out.println("Exception B was caught");
            } else if (e instanceof ExceptionA) {
                System.out.println("Exception A was caught");
            } else {
                System.out.println("Other exception was caught");
            }
        }
    }
}

