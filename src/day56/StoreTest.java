package day56;

import java.util.Arrays;
import java.util.List;

public class StoreTest {
    public static void main(String[] args) {
        Store s1=new Store();
        System.out.println(s1.name);
       // System.out.println(s1.allProducts);
      //  s1.allProducts.add(new Product("imac",3999));
      //  System.out.println(s1.allProducts);
        //trying witout usin second costractor
        List<Product> denisList= Arrays.asList(new Product("cookie",3),
                new Product("tea",3),
                new Product("coffee",3),
                new Product("muffins",5));
          Store s3=new Store();
   //     s3.allProducts.add(new Product("tea",3));
   //     s3.allProducts.add(new Product("coffee",3));
        System.out.println("s3 "+s3);
        Store s2=new Store ("Denis Store",denisList);
       System.out.println("s2 "+s2);
       Product p1=new Product("CheeseCake",10);
       s2.addProduct(p1);
       s2.addProduct("Latte", 3);
        System.out.println("s2 = "+s2);
        System.out.println("How many product store have "+s2.getProductCount());
        s2.displayProducts();
        System.out.println(s2.checkIfProductExists(p1));//chescake
        s2.removeProduct(p1);
        s2.displayProducts();
        System.out.println("More price than avarage "+s2.getAllProductsMoreThanAveragePrice());
    }
}
