package array_practice;

import java.util.Arrays;

public class RightShiftArray {
    public static void main(String[] args) {
    int [] num=new int []   {1,8,13,4,48,7,10};//10,1,8,13,4,48,7;
    //rigth shift
int []num1=new int[num.length];
int tem=num[num.length-1];
    for(int i=0;i<num.length-1;i++){

        num1[i+1]=num[i] ;


    }num1[0]=tem;

        System.out.println(Arrays.toString(num1));  }
}
