package day36;

import java.util.Arrays;

public class MethodPractice {
    public static void main(String[] args) {
        ////write a static void method to accept a long array.
        ////    It should swamp first value with last value of the array

        long[]myLongs={6L,11L,88L,32L,65L};
        System.out.println("before swamp "+ Arrays.toString(myLongs));
        swampFirstLastValue(myLongs);
        System.out.println("after swamp "+ Arrays.toString(myLongs));
    }public static void swampFirstLastValue(long[]nums){
        long      temp=nums[0];
 nums[0]=nums[nums.length-1];
 nums[nums.length-1]=temp;

 String str=null;
        String str1="";
        System.out.println(str+"     str1"+str1);//it is not same
Integer x=null;//it is not compile
        }
    }

