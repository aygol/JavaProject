package officeHour;

import java.util.Arrays;

public class Car {
    String brand;
    Engine e;
//car has engine we are using engine instant variable type
    //i want car object has passenger names attached to it
    String []passengers ;
    public static void main(String[] args) {
        Car c1=new Car();
     //   c1.brand="Toyota";
  c1.brand=new String("Toyota") ;
  c1.e=new Engine("V6",270);
       // System.out.println("c1 "+c1);
        c1.passengers=new String []{"Ziyoda","Aykokul","Mehtap","Rauf"};
        System.out.println("c1= "+c1);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", e=" + e +" passengers= "+ Arrays.toString(passengers)+
                '}';
    }
}
