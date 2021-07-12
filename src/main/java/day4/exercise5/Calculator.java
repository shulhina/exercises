package day4.exercise5;

public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public double modulus(double a, double b) {
        return a % b;
    }

    public double increment(double a) {
        return ++a;
    }

    public double decrement(double a) {
        return --a;
    }

    public double power(double a, double b) {
        return Math.pow(a, b);
    }

}
