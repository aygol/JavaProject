package day51_Polimorphism;

public abstract class Animal {
   public abstract void makeNoise();
  // {    System.out.println("general Animal noise");
 //   }
}
//I can add more classes as long as only class is public and name is name as file name.
 class Dog extends Animal{
    public void makeNoise(){
        System.out.println("Woof!!!");
    }}
class Horse extends Animal{
    public void makeNoise(){
        System.out.println("Neinei!!!");
    }}