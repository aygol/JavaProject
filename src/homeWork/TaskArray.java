package homeWork;

import java.nio.file.attribute.UserPrincipalNotFoundException;

public class TaskArray {
    public static void main(String[] args) {
        //create an int array of 6 elements and find out
        //average of the array
        //sum of all elements
        //sum of even numbers in the array
        //sum of odd numbers in the array
        //max number in the array
        //min number in the array
        int[] num = {2, 34, 23, 45, 54, 12};
        int total = 0;

        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < num.length; i++) {
            total = total + num[i];
            if (num[i] % 2 == 0) {
                evenSum = evenSum + num[i];
            } else {

                    oddSum = oddSum + num[i];
                }
            }
            System.out.println("avarage = " + total / num.length);
            System.out.println("evenSum " + evenSum);
            System.out.println("oddSum " + oddSum);

     int max=num[0];
     for(int numbers: num){
         if (numbers>max)  {
         max=    numbers;
     }}
        System.out.println("Max= "+ max);
            int min=num[0];
             for(int numbers: num) {
                 if (numbers < min) {
                     min=numbers;
                 }

             }
        System.out.println("Min= "+min);




        }
    }
