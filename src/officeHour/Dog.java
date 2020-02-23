package officeHour;

public class Dog extends Animal {
String dogName;

    @Override
    public void run() {
        System.out.println("dog is running");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Dog is eating");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("The dog is calling roof roof");
    }
    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}
