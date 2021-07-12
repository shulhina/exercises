package day11.ex1_2;


public class Ex2 {
    public static void main(String[] args) {
        MyInterface lambdaExample = () -> System.out.println("Here is a lambda String");
        lambdaExample.lambda();
    }
}
