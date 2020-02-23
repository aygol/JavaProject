package day47_Abstraction;

public abstract class Car {
    int year;   //i doo not need to use car object using this class
    String brand;
    public abstract void start();

    public abstract void goForward();


    public abstract void goBackward();


    public abstract void turn(String direction);

}
