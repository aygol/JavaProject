package day42;

public class Bike {
    int speed;
    int gear;
public Bike() {// constractor is a block of code it is nOt method it is constractor it is only called when object created.
    System.out.println("message from constractor");
}
    public Bike(int newgear){
    gear=newgear;
}public Bike (int gear , int speed){
  this.  gear=gear;
  this.  speed=speed;
    }public Bike(String str){
        System.out.println("Accept String!!!!");
    }
}
