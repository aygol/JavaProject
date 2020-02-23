package array_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class InterviewSwapNumbers {
    public static void main(String[] args) {
     //   ArrayList<Integer> lst=new ArrayList<>(Arrays.asList(2,8,6,4,23,45,56,89,100,34));
    int [] num=new int[]{12,13,56,9,45,2} ;

    for(int i=0;i<num.length/2;i++){
        int temp=num[i];
        num[i]= num [(num.length-1)-i];
        num [(num.length-1)-i]=temp;
    }
        System.out.println(Arrays.toString(num));
        String [] str=new String[]{"I","want","to","learn","java"} ;

        for(int i=0;i<str.length/2;i++){
            String temp4=str[i];
            str[i]= str [(str.length-1)-i];
            str [(str.length-1)-i]=temp4;
        }
        System.out.println(Arrays.toString(str));
 ArrayList<String>color=new ArrayList<> (Arrays.asList("Blue","purple","red","yellow","green")) ;
  for(int i=0; i<color.size()/2;i++) {
      String tempx=color.get(i);
      color.set(i,color.get(color.size()-1-i));
      color.set(color.size()-1-i,tempx);

  }
    //    Collections.sort(color);
        System.out.println("color "+color);
    }
    }

