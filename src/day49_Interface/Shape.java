package day49_Interface;

public abstract class Shape implements Drawable {
    String name;
    double area;
    public Shape(){

    }public Shape(String name){
        this.name=name;
    }
    public abstract void calculateArea();

}
