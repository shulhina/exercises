package day2.exercise4;

public class Dog {
    private String name;
    private int age;
    private double weight;

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public Dog(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(int age) {
        this.age = age;
    }

    public Dog(double weight) {
        this.weight = weight;
    }

    public void showExcitement() {
        System.out.println(this.name + " is wagging its tail!!!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
