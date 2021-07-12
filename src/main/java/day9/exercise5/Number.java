package day9.exercise5;

public class Number implements Runnable {
    int numberToMultiply;
    public Number(int numberToMultiply) {
        this.numberToMultiply = numberToMultiply;
    }

 

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": " + Thread.currentThread().getState());
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + this.numberToMultiply * i);
        }
        System.out.println(Thread.currentThread().getName() + "; " + Thread.currentThread().getState());
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Number n1 = new Number(2), n2 = new Number(5), n3 = new Number(8);
        Thread t1 = new Thread(n1, "t1)"), t2 = new Thread(n2, "t2"), t3 = new Thread(n3, "t3");
        t1.start();
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

 

}
