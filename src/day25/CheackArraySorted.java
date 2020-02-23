package day25;

import java.util.Arrays;

public class CheackArraySorted {
    public static void main(String[] args) {
      int[] nums={ 13,31,8,5,21,2};
      boolean isSortedAlready=true;

        System.out.println("nums = "+ Arrays.toString(nums));
        for(int x=0; x<nums.length; x++) {
            System.out.println("is " + nums[x] + "less than" + nums[x + 1] + " ?" + (nums[x] < nums[x + 1]));
            if (nums[x] < nums[x + 1]) {
                System.out.println("Arrray is not sorted, no point checking the rest");
                isSortedAlready = false;
                break;
            }
        }
        System.out.println("is Sorted already = "+ isSortedAlready);




    }
}
