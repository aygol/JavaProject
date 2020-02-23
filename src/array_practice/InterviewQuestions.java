package array_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class InterviewQuestions {
    public static void swapTreeNumber(int a, int b,int c){
      int   temp=0;
        System.out.println("before  a= "+a+" b= "+b+" c= "+c);
      if(a>b){
      temp=a;
      a=b;
      b=temp;
      }
        if(a>c){
            temp=a;
            a=c;
            c=temp;
        }
      if(b>c){
          temp=b;
          b=c;
          c=temp;
        }

        System.out.println("After a= "+a+" b= "+b+" c= "+c);
    }
    public static void main(String[] args) {
     //1)	How to swap number with using temp variable
     int a=8;
     int b=20;//after we swap basiclly we want a=20;b=8;
        int temp=0;
        System.out.println("Before swaping a = "+a+" b= "+b);
       temp=a;//temp=8;
        a=b; //a =20; b=20; temp=8;
        b=temp;//a=20; b=8; temp=8
        System.out.println("After swaping a = "+a+" b= "+b);

      //  swapTreeNumber(4,12,12);
     //   swapTreeNumber(50,25,300);
        System.out.println("=========without temp variable==============");

        int []num=new int[]{12,18,45,4,90,1,65};
       // Arrays.sort(num);

       for(int i=0;i<num.length;i++){

           for(int j=i+1;j<num.length;j++){
               if(num[i]>num[j]){
                  int  tem=num[i];
                    num[i]=num[j];
                    num[j]=tem;}}}
        System.out.println("After sorting Array "+Arrays.toString(num)  );
        System.out.println("======Reverse the Array========");

        int []arr=new int[]{120,8,450,4,90,1,65};
        System.out.println("before reverse Array "+Arrays.toString(arr)  );
        for(int j=0,i=arr.length-1;j<num.length/2;j++,i--){
            int tem1=arr[j];
            arr[j]=arr[i];
            arr[i]=tem1;
        }  System.out.println("After reverse Array "+Arrays.toString(arr)  );
         ArrayList<Integer> lst=new ArrayList<>(Arrays.asList(12,78,43,98,1,490,3,9,123));
    //   Collections.sort(lst);
for(int i=0; i<lst.size();i++){
    for(int j=i+1; j<lst.size();j++){
        if(lst.get(i)>lst.get(j)){
      int temp4=lst.get(i);
      lst.set(i,lst.get(j));
      lst.set(j,temp4);

}


    }
           }
        System.out.println("after sorting "+lst);
        ArrayList<Integer> lst1=new ArrayList<>(Arrays.asList(12,72,42,92,45,55,65,75,85));
        System.out.println("before reverse "+lst1);
    for(int i=0,j=lst1.size()-1; i<lst1.size()/2;i++,j--){
        int temp5=lst1.get(i);
        lst1.set(i,lst1.get(j));
        lst1.set(j,temp5);

    } System.out.println("after reverse "+lst1);


    }}
