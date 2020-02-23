package day37;

import java.util.ArrayList;
import java.util.List;

public class TaskAddingArrayList100 {
    public static void main(String[] args) {
//Given a ArrayList of 6 Integer 1,3,7,2,12,7
//insert 100 in between each numbers
//For example :
//1,100,3 ,100, 7, 100, 2, 100, 12, 100, 7

//Optionally make it a method
//write a static void method that accept a ArrayList
// of integer object and insert 100 in between items.
        ArrayList<Integer>nums=new ArrayList<>();
        nums.add(1);
        nums.add(7);
        nums.add(3);
        nums.add(12);
        nums.add(10);
        nums.add(7);
        insert100BetweenItemLis(nums);
    }public static void insert100BetweenItemLis(List<Integer> numbers){
        for(int i=1;i<numbers.size();i+=2){
        numbers.add(i,100) ;}
        System.out.println(numbers);
        }
    }






