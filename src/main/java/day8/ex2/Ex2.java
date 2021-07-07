package day8.ex2;

public class Ex2 {
    public static void main(String[] args) {
        try {
            SomeClass someClass = new SomeClass();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class SomeClass {

    public SomeClass() throws Exception {
        throw new Exception("Exception in SomeClass constructor!");
    }
}