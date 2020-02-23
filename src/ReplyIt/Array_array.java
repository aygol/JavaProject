package ReplyIt;

import java.util.Scanner;

public class Array_array {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        // leave above code alone :)
        // assume you have String array of 5 items
        //and print firt and last char of each items in one line

        //TODO: Write your code below
        for(int x=0; x<=4;x++){
            System.out.println(words[x].charAt(0)+""+words[x].charAt(words[x].length()-1));


}}}
