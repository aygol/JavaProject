package ReplyIt;

import java.util.Arrays;
import java.util.Scanner;

public class REply130Shifting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
        int temp=nums[0];//put last item of nums to temp
        int[]nums1=new int[size];//create new array to put left shifted array there
        for(int i=1; i<=size-1;i++){//put nums to nums1 but size-1 do not forget
            nums1[i-1]=nums[i];//if nums[1] nums1 has to be nums1[2]
            //last index item has to become  nums[0]
        }nums1[size-1]=temp;
        System.out.println(Arrays.toString(nums1));

    }}



