package day29;

import java.util.Arrays;

public class ArrayEvenNumber {
    public static void main(String[] args) {

      int []numbers=new int[100] ;//will fill up even numbers
        numbers[0]=0;//loop is calling and we can write x to (x*2)
        numbers[1]=2;
        numbers[2]=4;
        numbers[3]=6;
        numbers[99]=198;//99*2
        System.out.println("before we filling up the array \n"+Arrays.toString(numbers));
for(int i=0;i<numbers.length;i++) {
    numbers[i] = i * 2;
}System.out.println("After we filling up the array \n"+Arrays.toString(numbers));






    }
}
