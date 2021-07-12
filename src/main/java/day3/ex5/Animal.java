package day3.ex5;

public abstract class Animal {
    private String furColor = "furColor";

    public void makeNoise() {
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
