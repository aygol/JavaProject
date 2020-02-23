package officeHour;

public abstract class Animal implements Zoo{
    //default constractor

    int age;
    String color;
    String breed;//instance variable
    public void eat(){
        System.out.println("Animal is eating");//instance method
    }
    public void call(){
        System.out.println("the animal is calling");
    }public abstract void run();
}
