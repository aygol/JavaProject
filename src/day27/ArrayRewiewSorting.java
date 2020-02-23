package day27;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRewiewSorting {
    public static void main(String[] args) {
int []numbers=new int[5];
        Scanner scan=new Scanner(System.in);
      for(int i=0; i<5; i++){
          System.out.println("Enter an int number: ");
        int input=scan.nextInt();
        numbers[i]=input;



    }
        System.out.println(Arrays.toString(numbers));
Arrays.sort(numbers);
    int largestNumber=numbers[numbers.length-1];
    int minNumbers=numbers[0];
    }}
