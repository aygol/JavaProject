package officeHour;
class Circle{
    public double radius;
    public Circle(double radius){
        this.radius=radius;
    }public boolean equals (Object obj){
  //  Object o1=new Circle(3.4) ;
        if (obj instanceof Circle&&this.radius==((Circle)obj).radius){
         return true;
        }
        return false;
    }
}
public class TestCircle {
    public static void main(String[] args) {
        Circle c1=new Circle(3.5);
        Circle c2=new Circle(3.5);
        Circle c3=new Circle(4.5);
        System.out.println(c1.equals(c3));
    }
}

