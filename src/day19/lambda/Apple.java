package day19.lambda;

public class Apple {

    // Apple 안에서만 쓸 거면 내부 클래스로 만들어도 됨
    enum Color {
        RED, GREEN
    }

    private int weight; // 사과의 무게
    private Color color; // 사과의 색상 (enum Color에 있는 것만 지정할 수 있게 됨)


    public Apple(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", color=" + color +
                '}';
    }
}
