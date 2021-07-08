package day9.ex1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyTestThread extends Thread {

    public void run() {
        System.out.println("The current time " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()));
    }

    public static void main(String[] args) {
        MyTestThread t1 = new MyTestThread();
        t1.setName("MyThread");
        System.out.println("The Thread name is " + t1.getName());
        t1.run();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.run();

    }
}
