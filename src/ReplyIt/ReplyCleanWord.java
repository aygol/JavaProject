package ReplyIt;

import java.util.Arrays;

public class ReplyCleanWord {
    public static void main(String[] args) {
        //    System.out.println(clean ("good days bad days" ,"bad days"));
    }public static int[] mergR(int[] a,int[] b) {
        int[] arr = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            arr[i] = a[i];

        }
        for (int i = 0; i < b.length; i++) {
            arr[a.length + i] = b[i];
            System.out.println(Arrays.toString(arr));
        }return arr;

    }}



