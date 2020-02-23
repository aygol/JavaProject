package ReplyIt;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int num = inp.nextInt();
        //DO NOT CHANGE ABOVE CODE!  Write your code below
        if (num % 2 == 0) {
            System.out.print(num + " is even");
        } else if (num % 2 != 0)
            System.out.print(num + " is odd");


    }
}




