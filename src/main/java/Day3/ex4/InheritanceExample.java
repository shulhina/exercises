package Day3.ex4;

class Animal {
    private String furColor = "furColor";

    private void makeNoise(){
        System.out.println("Noise!!");
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public void getMakeNoise(){
        makeNoise();
    }
}

class Dog extends Animal{
}

public class InheritanceExample{
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.getFurColor());
        dog.getMakeNoise();
    }
}
