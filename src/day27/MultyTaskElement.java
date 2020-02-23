package day27;

import org.w3c.dom.ls.LSOutput;

public class MultyTaskElement {
    public static void main(String[] args) {
        int[][] numbers = {{12, 11, 10, 19}, {19, 20, 15}};
        int max = numbers[0][0];//assume that first element is the max
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (max < numbers[i][j]) {
                    max = numbers[i][j];
                }
            }
        }
        System.out.println("max= " + max);
        //solution with each loop
        int max2 = numbers[0][0];
        for (int[] each1DArray : numbers) { //variable single dimentional array
for(int eachInt:each1DArray){
if(max2<eachInt){
      max2=eachInt;


        }}//finding the minimum number
 int min=numbers[0] [0] ;
            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers[i].length; j++) {
                    if (min > numbers[i][j]) {
                        min = numbers[i][j];
                    } }
                System.out.println("minimum ="+ min);
                System.out.println("=======================================================");





        }}}}