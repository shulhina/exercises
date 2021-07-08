package day9.ex1;

import java.text.SimpleDateFormat;
import java.util.Date;


class ThreadTimeSleep extends Thread {
    private final String threadName;

    ThreadTimeSleep(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    static void printDateTime() {
        String str = "Current Date/Time : " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
        System.out.println(str);
    }

    public void run() {
        System.out.println("Running " + threadName);
        try {
            printDateTime();
            Thread.sleep(10000);
            printDateTime();
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
    }
}


public class MyThread {
    public static void main(String[] args) {
        ThreadTimeSleep t1 = new ThreadTimeSleep("MyThread");
        t1.start();
    }
}
