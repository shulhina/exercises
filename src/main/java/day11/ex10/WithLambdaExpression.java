package day11.ex10;


public class WithLambdaExpression {

    public static void main(String[] args) {

        MyInterface myInterface1 = (var1, var2) -> (var1 + var2);

        int result1 = myInterface1.addTwoNumbers(10, 20);

        System.out.println(result1);


        MyInterface myInterface2 = (var1, var2) -> {
            return (var1 + var2);
        };

        int result2 = myInterface2.addTwoNumbers(30, 40);

        System.out.println(result2);

    }

}