package day36;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class ArrayListMethodsPractice {
    public static void main(String[] args) {

            int[]nums = {44,11,111,111,33, 22, 11, 55, 33, 55,22, 99, 22, 55};
            ArrayList<Integer> intList = new ArrayList<>();

            for (int each : nums){
                if (! intList.contains(each)){
                    intList.add(each);
                }
            }
            System.out.println(intList);
        }
    }



