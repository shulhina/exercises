package day9.exercise4;

public class DemoThread1 extends Thread {

    public static void main(String[] args) {
        DemoThread1 rc1 = new DemoThread1();
        Thread t1 = new Thread(rc1);
        t1.start();
        DemoThread1 rc2 = new DemoThread1();
        Thread t2 = new Thread(rc2);
        t2.start();
        DemoThread1 rc3 = new DemoThread1();
        Thread t3 = new Thread(rc3);
        t3.start();

    }

    public void run() {
        System.out.println("running child Thread in loop : ");
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }

    }
}