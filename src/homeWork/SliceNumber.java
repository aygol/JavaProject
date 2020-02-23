package homeWork;

import java.util.Scanner;

public class SliceNumber {
    public static void main(String[] args) {
        //DO NOT CHANGE
        int num, digit1, digit2, digit3, digit4, digit5;
        //WRITE YOUR CODE HERE

        Scanner scan=new Scanner(System.in);
        int digit=0;
        System.out.println("Enter your number:");
         num=scan.nextInt();
        String digits="";
        while(num>0){

            digit=num%10;
            num=(num-digit)/10;
            digits+=digit;
        }
        for(int i=digits.length()-1;i>=0;i--){
            System.out.println(digits.charAt(i));
        }

    }



}


