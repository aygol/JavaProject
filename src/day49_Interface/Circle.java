package day49_Interface;

import static java.lang.StrictMath.PI;

public class Circle extends Shape implements Drawable  {
 int radius;

    public Circle(int radius,String name) {
        super();
       // this.name=name;
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println(PI*(radius*radius));
        area=PI*(radius*radius);
    }

    @Override
    public void draw() {
        System.out.println("Draw "+radius+" radius circle");
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}

