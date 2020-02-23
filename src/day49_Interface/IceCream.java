package day49_Interface;

public class IceCream implements Edible {
    public void eat() {
        System.out.println("eat with spoon!!!");
    }   public void drink(){
        System.out.println("drink it if it has melt");
        }
        public void digest(){
            System.out.println("Digesting icecream by leaking");
        }

    public static void main(String[] args) {
        IceCream i1=new IceCream();
        i1.drink();
        i1.eat();
        System.out.println(i1.toString());
        i1.digest();
    }
    }


