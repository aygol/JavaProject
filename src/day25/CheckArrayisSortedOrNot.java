package day25;

import java.util.Arrays;

public class CheckArrayisSortedOrNot {
    public static void main(String[] args) {
  int[] nums={13,31,8,21,2} ;
  int itemCount=nums.length;
  int numsSize=nums.length;
  int[] numsCopy= new int [itemCount];
   numsCopy [0] = nums[0];
        numsCopy [1] = nums[1];
        numsCopy [2] = nums[2];
        numsCopy [3] = nums[3];
        numsCopy [4] = nums[4];
        numsCopy [5] = nums[5];
        System.out.println("numsCopy= "+ Arrays.toString(numsCopy));
 Arrays.sort(numsCopy) ;
        System.out.println("after sort numsCopy= "+Arrays.toString(numsCopy));
   if(Arrays.equals(nums,numsCopy) ) {
       System.out.println("this is already sorted");
   }else{
       System.out.println("this array is not sorted");
   }



    }
}
