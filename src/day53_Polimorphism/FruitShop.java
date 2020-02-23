package day53_Polimorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FruitShop {
    public static void main(String[] args) {
        Apple a1=new Apple("sweet","red", "Fuji");
       // Fruit f1=a1;
        Fruit f2=new Apple("tasteless","hot red", "Gala");
        Fruit f3=new Orange("Sour","orange",12);
        Fruit f4=new Orange("very sweet","Blood Red", 10);
        System.out.println("a1.taste "+a1.taste);
        System.out.println("a1.color "+a1.color);
        System.out.println("a1.type "+a1.type);
        a1.getDigested();
        System.out.println("============================");

        Fruit f1=a1;

        System.out.println("f1.color = " + f1.color);
        System.out.println("f1.taste = " + f1.taste);
        //f1.type we cannot acces type becouse fruit does not acces it
        f1.getDigested();
        System.out.println("============");

      String str=null;
    //  System.out.println(str.charAt(0));//run time error no object there
      //  System.out.println(str.bark()); it compile error
        f1=new Orange("sour-sweet","redish", 11);
        f1.getDigested();
        System.out.println(f1.toString());
        Fruit[]myFruits={ f1,f2,f3,f4};
       for(Fruit each: myFruits){
           each.getDigested();
       }
//List<Fruit> FruitList= Arrays.asList(f1,f2,f3,f4);
 //it is not resiszeable, adding and removing does not work everything else work
 List <Fruit>fruitList=new ArrayList<>(Arrays.asList(f1,f2,f3,f4))  ;
       for(Fruit each:fruitList){
           System.out.println("each.toString() = "+each.toString());
       }
    }
}
