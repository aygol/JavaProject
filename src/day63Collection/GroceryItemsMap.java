package day63Collection;

import java.util.HashMap;
import java.util.Map;

public class GroceryItemsMap {
    public static void main(String[] args) {
        Map<String,Double> groceryNameAndPricePair=new HashMap<>();
        //add seven 7 items
        //try to add duplicate keys and see
        //try to use putIfAbsent
        groceryNameAndPricePair.put("Tomato",2.99);
        groceryNameAndPricePair.put("Banana",0.99);
        groceryNameAndPricePair.put("Eggplant",2.99);
        groceryNameAndPricePair.put("Parsley",1.99);
        groceryNameAndPricePair.put("Stawberry",4.99);
        groceryNameAndPricePair.put("Onion",3.99);
        groceryNameAndPricePair.put("Tomato",2.99);
        System.out.println(groceryNameAndPricePair);
//get the 3rd item value and print
        //double the price of the first and last item
        //try to reove tomato
        groceryNameAndPricePair.putIfAbsent("Pear",2.99);
        System.out.println("groceryLst = " +  groceryNameAndPricePair.get("Pear"));

        groceryNameAndPricePair.get("Banana");
        System.out.println("groceryLst = " +  groceryNameAndPricePair.get("Banana"));

        groceryNameAndPricePair.remove("Tomato");
        System.out.println("groceryLst.get(\"Tomato\") = " + groceryNameAndPricePair.get("Tomato"));
        System.out.println("groceryLst.containsKey(\"Tomato\") = " +  groceryNameAndPricePair.containsKey("Tomato"));
        groceryNameAndPricePair.replace("Banana",groceryNameAndPricePair.get("Banana")*2);//we changed the price
        System.out.println("Doubling Banana Price "+groceryNameAndPricePair.get("Banana"));
        //double newPrice=groceryNameAndPricePair.get("Banana")*2);
        //groceryNameAndPricePair.replace("Banana",newPrice);
        System.out.println("Final Map "+groceryNameAndPricePair);
        if(groceryNameAndPricePair.containsKey("Tomato")){
            groceryNameAndPricePair.remove("Tomato");
            System.out.println("No more Tomato");
        }





    }
}
