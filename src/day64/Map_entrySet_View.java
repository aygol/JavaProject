package day64;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_entrySet_View {
    public static void main(String[] args) {
        Map<String,Double> groceryPriceMap=new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 1.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);
        //Map is not iterable
        //in rder to iterate over map , we need to ge something iterable like set
        //Map store key value pair as Entry internally
        //and we can get this Entries out using entrySet( view
        //so we can perform operation on key value pair together
        Set<Map.Entry<String,Double>> entryView=groceryPriceMap.entrySet();
        for( Map.Entry<String,Double>each      : entryView){
            System.out.print("Key Entry is "+each.getKey());
            System.out.print(" Value Entry is "+each.getValue());
            System.out.println();
            if (each .getKey().length()==5){
                each.setValue(15.0);
            }
        }
        System.out.println("groceryPriceMap = "+groceryPriceMap);
        //interview question
        // How to iterate over a Map and update the value at the same time
        // according to certain condition
    }
}
