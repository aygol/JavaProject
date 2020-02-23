package day51_Polimorphism;

import day47_Abstraction.Shape;

public class ShapeArea extends Shape {
    public ShapeArea(String Rectangle) {
        super(Rectangle);
    }

    @Override
    public void calculateArea() {
        System.out.println(4*4);
    }

    @Override
    public String toString() {
        return null;
    }

    public static void main(String[] args) {
        day51_Polimorphism.Shape s1=new Triangle();
        day51_Polimorphism.Shape s2=new Rectangle();
        day51_Polimorphism.Shape s3=new Circle();
        day51_Polimorphism.Shape s4=new Circle();
        s1.draw();
        s2.draw();
        s3.draw();
        s4.draw();
        s1.toString();
    ;
    }
}
