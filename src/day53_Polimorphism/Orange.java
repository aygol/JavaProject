package day53_Polimorphism;

public class Orange extends Fruit {

    int vcLevel;
    public Orange(String taste, String color, int vcLevel){
      super(taste,color) ;
      this.vcLevel=vcLevel;
    }
    @Override
    public void getDigested() {
        System.out.println("Orrange with Vitamin C level "+
                "has color "+color+" and it has "+taste+" taste when you digest");
    }

    @Override
    public String toString() {
        return "Orrange{" +
                "vcLevel=" + vcLevel +
                ", taste='" + taste + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
