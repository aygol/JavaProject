package array_practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SwappingNumbers {

    public static void main(String[] args) {
        //createting temp variable to swap

        int a = 12;//a=30


        int b = 30;//b=30
        int temp = 0;
        System.out.println(" before swap the numbers a = " + a + " b= " + b);
        temp = a;//temp=12;a=12;
        a = b;//a=30;//b=30;
        b = temp;
        System.out.println(" after swap the numbers a = " + a + " b= " + b);
///without creating temp variable how to to swap
        int x = 12;//x=y    x=30  y=30
        int y = 30;
        x = x + y;//x=12+30;          stored the numbers inside the x variable
        y = x - y;  // y=( 12 +30)-30;    y=12;
        x = x - y;//x=( 12 +30)-12;       x=30;
        System.out.println(" after swap the numbers x = " + x + " y= " + y);
//without using sorting method how we can sort  the array
        int[] num = new int[]{1, 7, 4, 3, 89, 100, 2, 3};
//Arrays.sort(num);
// temp=num [0] ;
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
             //   int tmp = 0;
                if (num[i] > num[j]) {
                 int   tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;
                }
            }

        }

        System.out.println("*** "+Arrays.toString(num));
        System.out.println("=========================================================");
        //   ArrayList<Integer> lst1=new ArrayList<>  (Arrays.asList(13,24,3,2,1,56,76,100));
        ArrayList<Integer> lst = new ArrayList<>(Arrays.asList(1, 20, 3, 7, 98, 54, 32, 9));
        for (int i = 0; i < lst.size(); i++) {
            for (int j = i+1; j < lst.size(); j++) {
                 //  int temp1 = 0;
                    if (lst.get(i) > lst.get(j)) {
                 int   temp1 = lst.get(i);
                    lst.set(i, lst.get(j));
                    lst.set(j, temp1);
                }

            }

        }

                }
    }
