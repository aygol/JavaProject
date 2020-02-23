package day51_Polimorphism;
//flyable is super type of uprightFlyable
//flyable is more general uprightFlayable is less general but still
public interface UprightFlayable extends Flyable{

    //    public abstract void fly();
    public abstract void flyUpright();
}
