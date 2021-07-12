package day9.exercise3;

class MyThread {
    public static void main(String[] args) {
        DemoThread1 ex1 = new DemoThread1();
        Thread t1 = new Thread(ex1);
        t1.start();

        DemoThread1 ex2 = new DemoThread1();
        Thread t2 = new Thread(ex2);
        t2.start();

        DemoThread1 ex3 = new DemoThread1();
        Thread t3 = new Thread(ex3);
        t3.start();
    }

    static class DemoThread1 implements Runnable {

        public DemoThread1() {
            
        }

        @Override
        public void run() {
            System.out.println("running child Thread in loop : ");
            for (int j=1; j <= 10; j++){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(j);
            }

        }

    }
}
