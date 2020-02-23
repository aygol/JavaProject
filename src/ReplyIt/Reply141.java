package ReplyIt;

import java.util.Arrays;
import java.util.Scanner;

public class Reply141 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i =0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
      int nums1Size=size*2;
        int[] nums1=new int[nums1Size];
         nums1[nums1Size-1]=nums [size-1];
        System.out.println(Arrays.toString(nums1));

    }
}



