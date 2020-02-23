package ReplyIt;

import java.util.Scanner;

public class Array3I {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = input.nextLine();

            //leave above alone! :)
            //assume you have String array of 6 items
            //and print three neibouring items at a time till last item
            //write your code below
            arr = new String[]{"apple", "banana", "kiwi", "grape", "milk", "soda"};
            System.out.println(arr[i].substring(i, i + 3));
        }
    }
}