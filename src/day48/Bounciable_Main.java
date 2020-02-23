package day48;

public class Bounciable_Main {
    public static void main(String[] args) {
        Kangaroo k1=new Kangaroo("African",6);
        k1.bounce();
        k1.eat();
        k1.toString();
         Ball b1=new Ball("Global","blue");
         b1.toString();
         b1.bounce();
        System.out.println(b1+" b1");
        System.out.println(k1+" k1");
        Bouncible b3=new Ball("round", "silver");
        Bouncible k3=new Kangaroo("Coco", 5);
        System.out.println("ball "+b1);
        System.out.println("coco "+k3);
        k1.kickBox();
        k1.carryChildInThePocket();
    }
}
