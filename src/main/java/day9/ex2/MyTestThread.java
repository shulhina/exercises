package day9.ex2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyTestThread extends Thread {

    public void run() {
        System.out.println("The current time " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()));
    }

    public static void main(String[] args) throws InterruptedException {
        day9.ex1.MyTestThread t1 = new day9.ex1.MyTestThread();
        t1.setName("MyThread");
        System.out.println("The Thread name is " + t1.getName());
        t1.run();
        Thread.sleep(10000);
        t1.run();
    }
}
