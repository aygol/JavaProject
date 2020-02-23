package day56;

import org.w3c.dom.ls.LSOutput;

public class ProductTest{
public static void main(String[]args){



    Product p1 = new Product("Mackbook Pro",2999 );
    Product p2 = new Product( "Sony TV",499);
    Product p3 = new Product( "Sony TV",499);
    System.out.println(p1==p2);//equals methods coming from Object class because we inherited from Object class
    System.out.println(p2.equals(p3));
    System.out.println(p2==p3);


}
}

