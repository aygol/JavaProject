package day47_Abstraction;

public class Triangle extends Shape {
String name="triangle";
    int height;
    int base;





    @Override
    public void calculateArea() {
        area=height*base/2;
    }

    public Triangle(String name, int base, int height) {

        super(name);
        this.base=base;
        this.height=height;
    }


    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", base=" + base +
                '}';
    }
}



