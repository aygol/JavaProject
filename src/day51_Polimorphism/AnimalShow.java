package day51_Polimorphism;

public class AnimalShow {
    public static void main(String[] args) {
        Animal a1=new Dog();// Dog d1=new Dog();
        a1.makeNoise();
        a1=new Horse();
        a1.makeNoise();
     //   System.out.println(a1);
    }
}
