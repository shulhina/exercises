package day3.ex3;

class A {
    void method_test(){
        System.out.println("I am method from class A");
    }
}

class B extends A{

    public B() {
        super.method_test();
        method_test();
        System.out.println();
    }

    void method_test() {
        System.out.println("I am method from class B");
    }

}

public class InheritanceExample{

    public static void main(String[] args){
        B test = new B();

        test.method_test();
    }

}