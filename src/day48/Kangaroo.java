package day48;

public class Kangaroo implements Bouncible,BoxerWithBellyPounch{
    String name;
    int jumpDistance;

    @Override
    public void bounce() {
        System.out.println("Kangroo is bounching");
    }

    public void eat() {
       System.out.println("Kangaroo eat ");

   }

    public Kangaroo(String name, int jumpDistance) {
        this.name = name;
        this.jumpDistance = jumpDistance;
    }




    @Override
    public void kickBox() {
        System.out.println("Kangaroo with "+name+" is Kick Boxing");
    }

    @Override
    public void carryChildInThePocket() {
        System.out.println("Kangroo "+name+" is carying baby in packet");
    }

    @Override
    public String toString() {
        return "Kangaroo{" +
                "name='" + name + '\'' +
                ", jumpDistance=" + jumpDistance +
                '}';
    }
}
