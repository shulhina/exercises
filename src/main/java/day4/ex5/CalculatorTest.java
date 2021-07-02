package day4.ex5;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        System.out.println("Choose an option:");

        System.out.println("1. increment \n" +
                "2. decrement \n" +
                "3. multiply \n" +
                "4. divide \n" +
                "5. modulus \n" +
                "6. add \n" +
                "7. subtract \n" +
                "8. power \n");

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        double a, b = 0;

        System.out.print("a: ");
        a = scan.nextDouble();
        if (input > 2 && input <= 8) {
            System.out.print("b: ");
            b = scan.nextDouble();
        }
        
        scan.close();
        Calculator calculator = new Calculator();

        switch (input) {
            case 1:
                System.out.println("Answer: " + calculator.increment(a));
                break;
            case 2:
                System.out.println("Answer: " + calculator.decrement(a));
                break;
            case 3:
                System.out.println("Answer: " + calculator.multiply(a, b));
                break;
            case 4:
                System.out.println("Answer: " + calculator.divide(a, b));
                break;
            case 5:
                System.out.println("Answer: " + calculator.modulus(a, b));
                break;
            case 6:
                System.out.println("Answer: " + calculator.add(a, b));
                break;
            case 7:
                System.out.println("Answer: " + calculator.subtract(a, b));
                break;
            case 8:
                System.out.println("Answer: " + calculator.power(a, b));
                break;
        }
    }
}
