package day7.ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter A: ");
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
