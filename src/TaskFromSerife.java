import java.util.Arrays;
import java.util.Scanner;

public class TaskFromSerife {
    public static void main(String[] args) {
        //Given a number n, create and return a new int array of length n,
        //containing the numbers 0, 1, 2, ... n-1. The given n may be 0,
        //in which case just return a length 0 array. You do not need a separate
        //if-statement for the length-0 case; the for-loop should naturally execute 0
        //times in that case, so it just works. The syntax
        //to make a new int array is: new int[desired_length]

       Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();//scanner use for the n
        int[] nums=new int[n];//array created
        for(int i=0; i<n;i++) {   //loop for the array to give value of the items
            nums[i] = i;
        }
        System.out.println(Arrays.toString(nums));



    }
}
