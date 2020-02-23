package array_practice;

import java.util.Arrays;

public class SwapArrayWithOutTemp {
    public static void main(String[] args) {
        int [] num=new int []   {1,8,13,4,48,7,10};//13 to 48
        System.out.println("before swapping "+Arrays.toString(num));
        num[2]=num[2]+num[4];
        num[4]=num[2]-num[4];
        num[2]=num[2]-num[4];
       System.out.println("after swapping "+Arrays.toString(num));
    }
}
