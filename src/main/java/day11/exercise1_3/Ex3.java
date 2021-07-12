package day11.exercise1_3;


import java.util.ArrayList;

public class Ex3 {
    public static void main(String[] args) {
        ArrayInterface lambdaExample = ArrayList::new;
        System.out.println(lambdaExample.ArrayList(5));
    }
}

