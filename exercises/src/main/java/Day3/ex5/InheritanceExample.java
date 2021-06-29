package Day3.ex5;

abstract class Animal {
    private String furColor = "furColor";

    public void makeNoise(){
        System.out.println("Noise!!");
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public abstract void makeNoise(String noise);
}

class Dog extends Animal{

    @Override
    public void makeNoise(String noise) {
        System.out.println(noise);
    }

}

public class InheritanceExample{
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.getFurColor());
    }
}
