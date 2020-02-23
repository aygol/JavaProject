package array_practice;

import java.util.Arrays;

public class CheckArraysorted {
    public static void main(String[] args) {
   int[] nums={13,31,8,5,21,2} ;
        Arrays.toString(nums);
        System.out.println(" Arrays.toString(nums)"+ Arrays.toString(nums));
   int[]copyNums=new int[nums.length];
        copyNums [1]=13;;//copynums[0]=nums[0]
        copyNums [1]=31;
        copyNums [2]=8;
        copyNums [3]=5;
        copyNums [4]=21;
        copyNums [5]=2;

    for(int z=0; z<nums.length;z++){
        copyNums[z]=nums[z];}Arrays.sort(copyNums);
if(Arrays.equals(nums,copyNums)){

    System.out.println("Array alrady is sorted");
}else {
    System.out.println("Array is not sorted");

}}}



