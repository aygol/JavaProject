package day64;

import java.util.HashMap;
import java.util.*;

public class Map_valuesView {
    public static void main(String[] args) {
        Map<String,Double> groceryPriceMap=new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 1.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);
        Collection <Double>allPrices=groceryPriceMap.values();
        System.out.println("allPrices = "+allPrices);
       //first come first serve --first occurance will be removed
        allPrices.remove(1.99);
        System.out.println("groceryPriceMap = "+groceryPriceMap);
        //if you want no connection you may just copy allprices into different collection
        //like we did before
        List<Double>priceCopy=new ArrayList<>(allPrices);

        // List<Double>priceCopy=new ArrayList<>(groceryPriceMap.values());


    }
}
