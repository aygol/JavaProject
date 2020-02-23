package day49_Interface;

public class Burger implements Edible,Juicy {

    @Override
    public void eat() {
        System.out.println("Eating burger with bite");
    }

    @Override
    public void drink() {
        System.out.println("eat burger then drink Soda");
    }

    @Override
    public void melt() {
        System.out.println("Juicy burger melting");
    }

    @Override
    public void digest() {
        System.out.println("Digesting burger by chewing more");
    }

    public static void main(String[] args) {
        Burger b1=new Burger();
        b1.drink();
        b1.eat();
        b1.digest();

    }
}
