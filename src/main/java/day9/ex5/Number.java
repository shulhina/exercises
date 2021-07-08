package day9.ex5;

public class Number implements Runnable {
    int number;

    Number (int number){
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": " + Thread.currentThread().getState());
        System.out.println("Multiple of " + this.number + " are: ");
        for (int i = 1; i <= this.number; i++) {
            if (this.number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Number n1 = new Number(2);
        Thread t1 = new Thread(n1, "t1");

        Number n2 = new Number(5);
        Thread t2 = new Thread(n2, "t2");

        Number n3 = new Number(8);
        Thread t3 = new Thread(n3, "t3");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
