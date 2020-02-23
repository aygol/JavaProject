package day37;

import java.util.ArrayList;
import java.util.List;

public class PrintArrayWithParamater {
    public static void main(String[] args) {
        //create a method that acept a list of astring as argument
        // same thing as a method that has List of Srting paramater
        //and print out each and every item in the value in thelist verticaly
        //return nothing
      ArrayList<String> listName=new ArrayList<>();

        listName.add("Ayse");
        listName.add("Abdurrahman");
        listName.add("*AhmetGolcu*");
        listName.add("Furkan");
        listName.add("Ali");
        listName.add("Ceylin");
        printAlist(listName);
        System.out.println(getLongestElement(listName));      getLongestElement(listName);

    }public static void printAlist(ArrayList<String>lst){
        for(String each:lst){
            System.out.println("each = "+each);
        }
    }public static String getLongestElement(List<String>lst) {
        String longestName = lst.get(0);

        for (int i = 0; i < lst.size(); i++) {
            if (longestName.length() < lst.get(i).length()) {
                longestName = lst.get(i);
            }

        }  return longestName;
    }}