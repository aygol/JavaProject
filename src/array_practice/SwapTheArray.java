package array_practice;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapTheArray {
    public static void main(String[] args) {

        int []arr={1,9,8,6,2,7,100};//sort the number without using sort method
        System.out.println("Before sorting Array "+Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
           for (int j =i+1; j < arr.length; j++) {
               int tmp = 0;
               if (arr[i] > arr[j]) {
                   tmp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = tmp;
               }
           } }
        System.out.println("After sorting Array "+Arrays.toString(arr));
//Swap the arrayList and sort it

  // ArrayList<Integer>speed=new ArrayList<>();
        ArrayList<Integer> lst1=new ArrayList<>  (Arrays.asList(13,24,3,2,1,56,76,100));
       lst1.add(4);
        System.out.println("Before sorted ArrayList "+lst1);
        for (int i = 0; i < lst1.size(); i++) {
            for (int j =i+1; j < lst1.size(); j++) {
                int tmp = 0;
                if (lst1.get(i) > lst1.get(j) ) {
                    tmp=lst1.get(i);
                    lst1.set(i,lst1.get(j)) ;
                    lst1.set(j,tmp) ;

    }}}
        System.out.println("After sorted ArrayList "+lst1);

}}
