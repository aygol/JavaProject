package day51_Polimorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeTest {
    public static void main(String[] args) {
        Shape s1=new Triangle();
        Shape s2=new Rectangle();
        Shape s3=new Circle();
        Shape s4=new Circle();
        s1.draw();
        s2.draw();
        s3.draw();
        s4.draw();
        Shape [] manyShapes={s1,s2,s3,s4};
        for(Shape each:manyShapes) {
            each.draw();
        }
       List<Shape> shapes = new ArrayList<Shape>(Arrays.asList(s1,s2,s3,s4));
        for(Shape each:shapes){
            each.draw();
        }
        System.out.println("========For loop with List=================");
        for(int x=0; x<shapes.size(); x++){
           // System.out.println(shapes.get(x));day51_Polimorphism.Circle@10f87f48 // shapes.get(x);
            shapes.get(x).draw();
        }
    }
}
