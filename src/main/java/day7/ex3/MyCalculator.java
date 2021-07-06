package day7.ex3;


import java.util.Scanner;

class MyCalculator {
    long power(int a, int b) throws Exception {

        long result;
        if (a == 0 && b == 0) {
            throw new Exception("n and p should not be zero.");
        } else if (a < 0 || b < 0) {
            throw new Exception("n or p should not be negative.");
        } else {
            result = (long) Math.pow(a, b);
        }

        return result;
    }

    public static void main(String[] args) {
        MyCalculator my_calculator = new MyCalculator();
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int p = sc.nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
