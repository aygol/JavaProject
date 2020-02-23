package day49_Interface;


public class Square extends Shape implements Drawable {
    int length;

    public Square(int length,String name) {
        super(name);
        this.length = length;

    }

    @Override
    public void calculateArea() {
        System.out.println(length*length);
        area=length*length;
    }

    @Override
    public void draw() {
        System.out.println("Draw "+ length+ " length "+name);
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}

