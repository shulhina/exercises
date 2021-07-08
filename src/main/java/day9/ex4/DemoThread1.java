package day9.ex4;

public class DemoThread1 extends Thread{

    public static void main(String[] args) {
        DemoThread1 t1 = new DemoThread1();
        DemoThread1 t2 = new DemoThread1();
        DemoThread1 t3 = new DemoThread1();

    }

    public DemoThread1() {
        // working just with run();

        day9.ex3.DemoThread1 rc = new day9.ex3.DemoThread1();
        Thread t = new Thread(rc);
        t.start();
    }

    public void run() {
        System.out.println("running child Thread in loop : ");
        for (int i=1; i <= 10; i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }

    }
}