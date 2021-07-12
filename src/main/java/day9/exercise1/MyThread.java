package day9.exercise1;


public class MyThread {
    public static void main(String[] args) {
        ThreadTimeSleep t1 = new ThreadTimeSleep("MyThread");
        t1.start();
    }
}
