package day9.ex3;

public class DemoThread1 implements Runnable {

    public static void main(String[] args) {
        DemoThread1 t1 = new DemoThread1();
        DemoThread1 t2 = new DemoThread1();
        DemoThread1 t3 = new DemoThread1();

    }

    public DemoThread1() {
        Thread thread = new Thread();
        thread.run();
    }

    @Override
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
