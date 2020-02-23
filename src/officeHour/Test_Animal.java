package officeHour;

public class Test_Animal {
    public static void main(String[] args) {


 //   Animal animal1=new Animal();  if the class abstract we cannot make a object
    Dog dog=new Dog();
    dog.eat();
    dog.call();
    dog.sleep();
    System.out.println("=================================");
    Cat cat=new Cat();
    cat.eat();
    cat.call();
    cat.sleep();

}}
