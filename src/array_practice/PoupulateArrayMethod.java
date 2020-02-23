package array_practice;

import java.util.Arrays;

public class PoupulateArrayMethod {
    public static int[] populateArray8(int len) {//lengthy of the array

        int[] arr = new int[len];//len=length of the array

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));

        return arr;
    }

    public static void main(String[] args) {
populateArray8(9);
    }

}





