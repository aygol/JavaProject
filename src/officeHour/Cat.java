package officeHour;

public class Cat extends Animal{

    String eyeColor;

    @Override
    public void eat() {
        super.eat();
        System.out.println("the cat eating ");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("The cat calling meow meow");
    }

    @Override
    public void run() {
        System.out.println("The cat is running");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }
}
