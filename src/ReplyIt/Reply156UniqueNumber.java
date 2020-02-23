package ReplyIt;

import java.util.Scanner;

public class Reply156UniqueNumber {


        public static void main(String[] args) {
        /*    Scanner scan = new Scanner(System.in);
            int size = scan.nextInt();
            int[] nums = new int[size];
            for(int i=0; i < size; i++){
                nums[i] = scan.nextInt();*/
            int[] nums ={2, 5, 5, 6, 3, 6, 9, 34, 3};

            printUniqueNumbers(nums);
        }

        public static void printUniqueNumbers(int[] nums){
            //WRITE YOUR CODE HERE

            for(int i=0; i<nums.length;i++){
                int countUniqueNum=0;
                for(int k=0; k<nums.length;k++) {
                    if(nums[i]==nums[k]){
                        countUniqueNum++;
                    }
                }

                if(countUniqueNum==1){
                    System.out.println(nums[i]);

                }
            }}}

