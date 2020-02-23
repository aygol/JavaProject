package day27;

import java.util.Arrays;

public class NumbersDimentional {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12, 13}};
        for (int i = 0; i < numbers.length; i++) {

            System.out.println(Arrays.toString(numbers[i]));
            System.out.println(Arrays.toString(numbers[1]));  //
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println(numbers[i][j] + " ");


            }
        }
        System.out.println("\n=========================================");
        int[][] ages = {{10}, {12, 13, 14, 16, 17}, {19, 20, 21, 21, 23}};
        for (int i = 0; i < ages.length; i++) {
            for (int j = 0; j < ages[i].length; j++) {
             if(ages[i][j]%2!=0){//print even numbers
                 continue;
             }
                System.out.println(ages[i][j] + " ");



    }}}}