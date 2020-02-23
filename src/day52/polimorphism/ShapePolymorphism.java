package day52.polimorphism;

import java.util.ArrayList;
import java.util.List;

public class ShapePolymorphism {
    public static void main(String[] args) {
        Circle s2=new Circle("penny", 5);  s2.draw();
        Shape s3=new Circle("penny", 5);   s3.draw();
        Drawable s4=new Circle("penny",5);    s4.draw();

        Object  s1=new Circle("penny", 5); // s1.draw();compile error
        //s1.draw();if you give OBJECT it compile error
        System.out.println(s1.toString());
        System.out.println(s1.getClass().getSimpleName());
        System.out.println("******************************");
        printAnyShapeArea(s3);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        Shape s6=new Rectangle("Book", 5,4);   //s6.draw();
       printAnyShapeArea(s6);
        System.out.println("##############");
        drawShape3Times(s2);
        drawShape3Times(s6);

        Shape s9 = new Rectangle("box",4,7);
        Shape s10 = new Circle("Ball",5);
        s10.draw();
        s9.draw();


        Shape[] shap1={s10,s2,s3} ;
        for(Shape each:shap1){
            each.draw();
        }

        List<Shape> lst=new ArrayList<>();
        lst.add(s10);
        lst.add(s2);
        lst.add(s3);
        for(Shape each:lst){
            each.draw();
        }



    }//create a method that accept any sahpe and print out the calculated area
public static void drawShape3Times(Shape anyShape){
        anyShape.draw();
    anyShape.draw();
    anyShape.draw();
}

    public static void printAnyShapeArea(Shape anyShape){
       anyShape.calculateArea();
        System.out.println(anyShape.name+" 'S area is=" +anyShape.area);
    }
}
