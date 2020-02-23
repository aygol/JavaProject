package day64;

import java.util.Collection;
import java.util.HashMap;
import java.util.*;

public class Map_valuesView2 {
    public static void main(String[] args) {
        Map<String,Double> groceryPriceMap=new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 1.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);
        System.out.println("groceryPriceMap = "+groceryPriceMap);
        Collection<Double> allPrices=groceryPriceMap.values();
        //System.out.println("allPrices = "+allPrices);
        //remove all entry of the groceryPriceMap if the price values is more than 3
        allPrices.removeIf(eachPrice->eachPrice>3);//lambda expression
        System.out.println("groceryPriceMap = "+groceryPriceMap);
        //the logic is to use strict connection between the view and the orginal
        //iterate over the allprices and check the condition for more than 3 or not
        //if it is more than 3 than remove
        //can not remove elements inside for each loop
        //so only option other than remeove if methot is to use
        Iterator<Double> itr = allPrices.iterator();
        while (itr.hasNext()) {
            if (itr.next() > 3) {
                itr.remove();
            }
        }

        System.out.println("groceryPriceMap = " + groceryPriceMap);

    }
}
