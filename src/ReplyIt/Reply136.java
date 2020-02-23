package ReplyIt;

import java.util.Scanner;
//nums → [1, 5, 5, 1, 1] → true
//nums → [1, 8, 5, 5, 0] → true
//nums → [1, 5, 4, 1, 5] → false
//nums → [1, 4, 4, 1, 99] → false
public class Reply136 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO Type your code below:
    int    count=0;
        for(int each:nums) {
            if (each == 5) {
                count++;
            }
        }

   if(count>0) {
       System.out.println("true");
   }  else{
                System.out.println("false");}



    }
}


