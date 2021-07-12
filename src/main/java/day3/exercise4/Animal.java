package day3.exercise4;

public class Animal {
    private String furColor = "furColor";

    private void makeNoise() {
        System.out.println("Noise!!");
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public void getMakeNoise() {
        makeNoise();
    }
}
