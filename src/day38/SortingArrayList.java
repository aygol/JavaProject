package day38;

import java.util.*;

public class SortingArrayList {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>(Arrays.asList(300,100,389,900,34,12));
        System.out.println("before the sort nums "+nums);
        Collections.sort(nums);
        System.out.println("After the sort nums "+ nums);
        //this version of sort method accept 2 argumens
        //1st is the list be sorted
        //2nd a Comparator Object that contain comparing logic
        Collections.sort(nums,Comparator.reverseOrder());
        System.out.println(" Collections.sort(nums,Comparator.reverseOrder()) "+ nums);
        nums.sort(Comparator.naturalOrder());
        System.out.println("after this method nums.sort(Comparator.naturalOrder());"+nums);
    }
}
