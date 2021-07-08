package day9.ex1;

public class Ex1 extends Thread {

    public void run() {
        System.out.println("MyThread running");
    }

    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        t1.setName("MyThread");
        System.out.println("The Thread name is " + t1.getName());
        //System.out.println("The current time " + t1.getState());

    }
}
