package day64;

import java.util.*;

public class MapContinue {
    public static void main(String[] args) {
        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 1.99);
       // groceryPriceMap.put("Tomato", 3.00);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);
    //    groceryPriceMap.putIfAbsent("Fish", 12.99);
    //    groceryPriceMap.putIfAbsent("Apple", 100.0);
        //Map view:
        //keySet view, values view, entrySet view
        //How do I store all the keys into a collection
        //what do you think the data type will be store such collection
        //--Set because keys are unique
        //we can use keySet ()method of Map to get set of Keys
        //this set is strictly connected to their orginal map
        //if you remove an item , map entry with this key will be also removed
        Set<String >allNames=groceryPriceMap.keySet();
        //System.out.println("allNames= "+allNames);
       // allNames.remove("Tomato");
       // System.out.println("allNames no Tomato "+allNames);

        System.out.println("groceryPriceMap after "+groceryPriceMap);
        //what if we do want such relationship and we just want to use the keys some
        //get a copy of the Set into different object
        Set <String>namesCopy=new HashSet<>(allNames);//you can dump all of them easy
        namesCopy.remove("Tomato");
        System.out.println("namesCopy = "+namesCopy);

        System.out.println("groceryPriceMap "+groceryPriceMap);
    }
}
