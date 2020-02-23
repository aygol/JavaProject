package day48;

public class Ball implements Bouncible{
    String shape;
    String color;

    @Override
    public void bounce() {
        System.out.println("Ball is Bouncing");
    }

    public Ball(String shape,String color) {
        this.shape = shape;
        this.color=color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "shape='" + shape + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
