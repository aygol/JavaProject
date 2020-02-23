package ReplyIt;

import java.util.Scanner;

public class ReplyJavaFun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String[]sentArr=sentence.split(" ");
        String reversed = "";
        //TODO: start your code here
        for(int i=sentArr.length-1;i>=0;i--){
            reversed+=sentArr[i]+" " ;

            //End your code here. do not modify below statement
        }reversed= reversed.trim();
        System.out.println(reversed);

    }
}


