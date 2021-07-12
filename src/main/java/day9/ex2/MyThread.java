package day9.ex2;

import java.text.SimpleDateFormat;
import java.util.Date;


public class MyThread {
    public static void main(String[] args) {
        ThreadTimeSleep t1 = new ThreadTimeSleep("MyThread");
        t1.start();
    }
}
