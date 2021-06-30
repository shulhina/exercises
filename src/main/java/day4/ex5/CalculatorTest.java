package day4.ex5;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        System.out.println("Choose an option:");
        System.out.print("""
                1. increment\s
                2. decrement\s
                3. multiply\s
                4. divide\s
                5. modulus\s
                6. add\s
                7. subtract\s
                8. power
                """);

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        double a, b = 0;

        System.out.print("a: ");
        a = scan.nextDouble();
        if (input >= 1 && input <= 8) {
            System.out.print("b: ");
            b = scan.nextDouble();
        }

        Calculator calculator = new Calculator();

        switch (input) {
            case 1 -> System.out.println("Answer: " + calculator.increment(a));
            case 2 -> System.out.println("Answer: " + calculator.decrement(a));
            case 3 -> System.out.println("Answer: " + calculator.multiply(a, b));
            case 4 -> System.out.println("Answer: " + calculator.divide(a, b));
            case 5 -> System.out.println("Answer: " + calculator.modulus(a, b));
            case 6 -> System.out.println("Answer: " + calculator.add(a, b));
            case 7 -> System.out.println("Answer: " + calculator.subtract(a, b));
            case 8 -> System.out.println("Answer: " + calculator.power(a, b));
        }
    }
}
