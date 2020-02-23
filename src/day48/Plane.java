package day48;

public class Plane implements Flyable {
 String name;
 int speed;
 int capacity;



    @Override
    public void fly() {

            System.out.println("plane is flying");
    }

    public static void main(String[] args) {
        Plane p1=new Plane();
        p1.fly();
        System.out.println("Have wing "+Flyable.Have_Wing);
        System.out.println(Have_Wing);
    }
}
