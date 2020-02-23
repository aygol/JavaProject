package ReplyIt;

import java.util.Scanner;

public class Reply3Print {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i=0;i<6;i++)
        {
            arr[i] = input.nextLine();
        }
        //leave above alone! :)
        //assume you have String array of 6 items
        //and print three neibouring items at a time till last item
        //write your code below
        for(int j=0; j<6; j++){

            System.out.println(arr [j]+" , "+arr [j+1]+" , "+arr [j+2]);
        }

    }}


