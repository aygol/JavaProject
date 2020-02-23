package method_Practice;

import java.util.Arrays;

public class MethodOverloading {
    public static void main(String[] args) {
        int[] ages = {23, 43, 5, 7, 87};
     ages=  SortDe(ages);
        System.out.println(Arrays.toString(SortDe(ages)));

    }//write the method that accepts aan int array and sort it in descending oreder
    public static int[]SortDe(int[]arr){
      Arrays.sort(arr) ;//assending order
    int [] arrDescending=new int[arr.length];
     int j=0;

    for(int i=arr.length-1;i>=0;i-- ){
        arrDescending[j]=arr[i];
        j++;
    }
    return arrDescending;
    }
}
