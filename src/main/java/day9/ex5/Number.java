package day9.ex5;

public class Number implements Runnable {
    public void run(int number) {
        System.out.print("Multiple of " + number + " are: ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    @Override
    public void run() {

    }

    public static void main(String[] args) {
        Number n1 = new Number();
        n1.run(2);

        Number n2 = new Number();
        n2.run(5);

        Number n3 = new Number();
        n3.run(8);
    }

}
