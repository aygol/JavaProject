package array_practice;

import java.util.Arrays;

public class LeftShiftedArray {
    public static void main(String[] args) {
        int [] num=new int []   {1,8,13,4,48,7,10};//8,13,4,48,7,10,1;
        //left shift
        int []num1=new int[num.length];
        int tem=num[0];
        for(int i=0;i<num.length-1;i++){

            num1[i]=num[i+1] ;


        }num1[num.length-1]=tem;

        System.out.println(Arrays.toString(num1));  }
}



