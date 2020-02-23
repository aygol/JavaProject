package day49_Interface;

public class Test_Shape {
    public static void main(String[] args) {
  Square s1=new Square (6,"box") ;
         s1.calculateArea();

        System.out.println(s1);

        Circle c1=new Circle(3,"ball");
        c1.calculateArea();
        c1.draw();
        System.out.println("c1 "+c1);
    }}
