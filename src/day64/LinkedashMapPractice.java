package day64;

import java.util.*;

public class LinkedashMapPractice {
    public static void main(String[] args) {
        //SortedMap extends Map and it will keep the sorted order
        //TreeMap is the implementation class


            Map<String, Double> groceryPriceMap = new LinkedHashMap<>();
            groceryPriceMap.put("Tomato", 1.99);
            groceryPriceMap.put("Patato", 2.99);
            groceryPriceMap.put("Grape", 3.99);
            groceryPriceMap.put("Banana", 1.99);
            groceryPriceMap.put("Apple", 1.89);

            System.out.println("groceryPriceMap = " + groceryPriceMap);


        }


    }



