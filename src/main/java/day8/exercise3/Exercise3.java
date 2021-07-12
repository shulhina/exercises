package day8.exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        try {
            someMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void someMethod() throws Exception {
        try {
            someMethod2();
        } catch (Exception e) {
            throw new Exception("Exception in someMethod method!");
        }
    }

    public static void someMethod2() throws Exception {
        throw new Exception("Exception in someMethod2 method!");
    }
}
