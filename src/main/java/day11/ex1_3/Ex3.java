package day11.ex1_3;


import java.util.ArrayList;

public class Ex3 {
    public static void main(String[] args) {
        MyInterface lambdaExample = ArrayList::new;
        System.out.println(lambdaExample.ArrayList());
    }
}

@FunctionalInterface
interface MyInterface {
    ArrayList ArrayList();
}
