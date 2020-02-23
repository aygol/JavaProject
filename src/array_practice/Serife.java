package array_practice;

import java.util.Arrays;

public class Serife {
    public static void main(String[] args) {

        int[]ints1= {10, 40, 50, 3, 1};
        int[]ints2= {11, 0, 500, 44, 1101};
        int[]arr=new int[ints1.length+ints2.length];
        for(int i=0; i<ints1.length;i++){
            arr[i]=ints1[i];
        }
//        ArrayList <Boolean>result=new ArrayList<>();
        for(int i=0; i<ints2.length;i++){
            arr[(ints1.length)+i]=ints2[i];
        }
        System.out.println(Arrays.toString(arr));
        int[]s1= {10, 40, 5, 3, 1};
        int[]s2= {11, 0, 500, 44, 1101};
        int[]arrs=new int[ints1.length+ints2.length];
        System.arraycopy(s1,0,arrs,0,s1.length);
        System.arraycopy(s2,0,arrs,s1.length,s2.length);



    }
}
