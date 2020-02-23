package array_practice;

import java.util.Arrays;

public class ArrayFurkan {
    public static void main(String[] args) {
    //    int[] arr = {11, 12, 13, 14};
     //   int[] arr2 = new int[4];
     //   int[] arrtemp = new int[4];
       // System.out.println("before assign ");
       // System.out.println("arr " + Arrays.toString(arr));
      //  System.out.println("arr2 " + Arrays.toString(arr));

      //  arrtemp = arr;
     //   arr = arr2;
     //   arr = arrtemp;

    //    System.out.println("arr " + Arrays.toString(arr));
     //   System.out.println("arr2 " + Arrays.toString(arr));
        // System.out.println("After assign " );
        //  System.out.println("using temp");}
      //centeredAverage([1, 2, 3, 4, 100]) → 3
        //centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
        //centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
        int[] nums = {-10, -4, -2, -4, -2, 0};
        System.out.println(centeredAverage(nums));

    }
        public static int centeredAverage(int[] nums) {
            int max = nums[0];
            for (int i = 0; i < nums.length; i++) {
                if (max < nums[i]) {
                    max = nums[i];
                }
            }
            int min = nums[0];
            for (int i = 0; i < nums.length; i++) {
                if (min > nums[i]) {
                    min = nums[i];
                }
            }
            int count = 0;
          //  int average = 0;
            for (int i = 0; i < nums.length; i++) {
              //  if (nums[i] != max && nums[i] != min) {
                    count += nums[i];
                }

          return   count /(nums.length - 2);


        }}
