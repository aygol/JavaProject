package ReplyIt;

import java.util.Scanner;

public class ArrayString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextLine();

        //leave above alone! :)
        //assume you have String array of 5 items
        //write your code below
       String arr1=arr[i].substring(0,3);
        System.out.println(arr1);

    }
}}
