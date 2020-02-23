package day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListAsReturnType {
    public static void main(String[] args) {
        System.out.println(getListFromToFinalNumber(7));
        System.out.println(getListFromToFinalNumber(2));
        System.out.println(getListFromToFinalNumber(20));
List<Integer>myList=getListFromToFinalNumber(25);
        System.out.println("myList "+myList);
     //   System.out.println(getListFromToFinalNumber());
    }//Create a method that accept a finalNumber as int

    //reurn an aarray List of Integer containing numbers
    //Starting from 1 till final Number
    public static List<Integer> getListFromToFinalNumber(int finalNumber) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i <= finalNumber; i++) {
            nums.add(i);
        }
    return nums;}
}