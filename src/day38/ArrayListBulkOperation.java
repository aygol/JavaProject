package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListBulkOperation {
    public static void main(String[] args) {
        List<String> groceries= Arrays.asList("Eggs","Milk","Butter"+"Apple"+"Salmon");
        System.out.println("groceries ="+groceries);
        ArrayList<String>newLst=new ArrayList<>(groceries);
        newLst.add("Diet coke");
        newLst.add("Sugar");
        List<String>newItemsToAdd=Arrays.asList("Pasta","branzini","Asparagus","Spinach");
        newLst.addAll(newLst);



    }
}
