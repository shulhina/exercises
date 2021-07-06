package day7.ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            int A=sc.nextInt();
            int B=sc.nextInt();
            System.out.println(A/B);
        } catch(ArithmeticException | InputMismatchException e) {
            if (e instanceof ArithmeticException) {
                System.out.println("java.lang.ArithmeticException: / by zero");
            } else if (e instanceof InputMismatchException){
                System.out.println("java.util.InputMismatchException");
            }
        }
    }
}
