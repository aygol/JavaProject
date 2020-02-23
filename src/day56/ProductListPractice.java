package day56;

import java.util.ArrayList;
import java.util.List;

public class ProductListPractice {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Macbook Pro", 2999));
        productList.add(new Product("Sony TV", 499));
        productList.add(new Product("Macbook Air", 1299));
        productList.add(new Product("Iphone X", 999));
        productList.add(new Product("Iphone XL", 1299));
        productList.add(new Product("Sumsung 10", 499));
        System.out.println("productList.size() = " + productList.size());
        //check whether we have Sony Tv with 499
        boolean result = false;
        //how does contains method decide whether the list contains the object we are looking for
        //it will internally call the equalls method of that type(Pruduct here)
        //if it eturn true then contains method will return true if not , return false
        //same thing for remove how can i remove an item from the list using remove method that accept

        result=productList.contains(new Product("Sony TV", 499));
        System.out.println("result=productList.contains Sony TV= "+ result);
        result=productList.contains(new Product("Apple TV", 499));
        System.out.println("result=productList.contains Apple = "+ result);
        Product sony=new Product("Sony TV", 499);
        Product apple=new Product("Apple TV", 499);
        Product iphone= new Product("Iphone XL", 1299);
        productList.remove(sony);
        result=productList.contains(sony);
        System.out.println("After removing "+result);
        System.out.println("apple index= "+productList.indexOf(apple));
        System.out.println("sony index= "+productList.indexOf(sony));
        System.out.println("iphone index= "+productList.indexOf(iphone));
        for (Product each : productList) {
            // if(each.getName().equals("Sony TV")&& each.getPrice()==499){
            //    result =true;
            //  }
            // }
            //  System.out.println("has Sony TV = "+ result);
            if (each.equals(new Product("Sony TV", 499))) {
                result=true;

            }
        }
        System.out.println("has Sony TV = "+ result);
    }}
