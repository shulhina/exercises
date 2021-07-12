package day7.exercise2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        try {
            int A = sc.nextInt();
            System.out.print("Enter B: ");
            int B = sc.nextInt();
            System.out.println("A / B: " + (A / B));
        } catch (ArithmeticException | InputMismatchException e) {
            if (e instanceof ArithmeticException) {
                System.out.println("java.lang.ArithmeticException: / by zero");
            } else {
                System.out.println("java.util.InputMismatchException");
            }
        }
    }
}
