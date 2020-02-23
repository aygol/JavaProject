package day63Collection;

import java.util.*;
import java.util.Map;

public class MapAddingElement {
    public static void main(String[] args) {
        Map<String,Integer> nameAgePair=new HashMap<>();
        //adding elements :put
        nameAgePair.put("Zehra",6);
        nameAgePair.put("Muhammed",21);
        nameAgePair.put("Maiia",27);
        nameAgePair.put("Aidar",20);
        nameAgePair.put("Fatih",27);
        nameAgePair.put("Ayse",44);
        System.out.println("nameAgePair = "+nameAgePair);
        System.out.println("nameAgePair.size() "+nameAgePair.size());
        System.out.println("Zehras Age = "+nameAgePair.get("Zehra"));
        //if we add new value if the same in our Map it is replace with old one
        // it did not accept duplicate
       nameAgePair.put("Zehra",7);
        System.out.println(nameAgePair.containsKey("Ayse"));//true
        System.out.println(nameAgePair.containsKey("Hasan"));//false
        nameAgePair.putIfAbsent("Zehra",10);
        nameAgePair.putIfAbsent("Ceylin",11);
        //Updating the element using replace
        nameAgePair.replace("Maiia",17);
        System.out.println("nameAgePair.get(Maiia)= "+nameAgePair.get("Maiia"));
        nameAgePair.replace("Zehra",7,9);
        System.out.println("nameAgePair.get(Zehra"+nameAgePair.get("Zehra"));
        nameAgePair.replace("Zehraaaa",7,9);//Do nothing because we donot having
nameAgePair.remove("Fatih");
//Do not use get methot for check if exist or not
        System.out.println("nameAgePair.get(\"Fatih\") = "+nameAgePair.get("Fatih"));
        System.out.println("nameAgePair.containsKey(\"Fatih\") = "+nameAgePair.containsKey("Fatih"));
        System.out.println();

    }
}
