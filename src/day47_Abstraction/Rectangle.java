package day47_Abstraction;

public class Rectangle  extends Shape{
    int width;
    int height;
    public Rectangle( int width,int height){
        super("my rectangle");
        this.height=height;
        this.width=width;
    }public void calculateArea(){
      area=width*height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", area=" + area +
                ", name='" + name + '\'' +
                '}';
    }
}

