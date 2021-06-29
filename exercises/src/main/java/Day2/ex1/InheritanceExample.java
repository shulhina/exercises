package Day2.ex1;

class Cycle{

    String define_me(){

        return "a vehicle with pedals.";

    }

}

class Bike extends Cycle{

    String define_me(){

        return "a cycle with an engine.";

    }

    Bike(){
        System.out.println("Hello I am a Bike I am "+ super.define_me());
        String temp=define_me();

        System.out.println("My ancestor is a cycle who is "+temp );

    }

}

public class InheritanceExample {
    public static void main(String[] args) {
        Bike M = new Bike();
    }
}