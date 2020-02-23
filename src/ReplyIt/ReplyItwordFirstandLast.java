package ReplyIt;

import java.util.Scanner;

public class ReplyItwordFirstandLast {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        System.out.println(word.charAt(0) + "" + word.substring(word.length()-1));

    }
}
