package day11.exercise1_1;


import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("This program multiplies A and B!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        double A = sc.nextDouble();
        System.out.print("Enter B: ");
        double B = sc.nextDouble();

        MyInterface lambdaExample = (a, b) -> a * b;
        System.out.println("A * B: " + lambdaExample.multiply(A, B));

        sc.close();
    }
}
