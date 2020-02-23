package array_practice;

import java.util.Arrays;
import java.util.List;

public class ArrayFindMax {
    public static void main(String[] args) {
        //min and max
        int nums[]={1,245,3,4,5,7,8,9};
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max) {
                max = nums[i];
            }
            }

        System.out.println(max);
        System.out.println(Arrays.toString(nums));
        System.out.println();
//List<Integer> list=new ArrayList<>(Arrays.asList(1,20,30,5,6,8));
    }
}
