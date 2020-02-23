package ReplyIt;

import java.util.Arrays;
import java.util.Scanner;

public class Reply140 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        //TODO: Write your code below
        String n2="";
        for(int i=0; i<words.length;i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (j == 0) {
           n2+=    words[0];
                }
                    if (j == (words[j].length() - 1)){
               n2+=(words[j].length() - 1);
                    }if(words[j]==(" ")){
            n2+=(" ");
                    }
            }}}}

      //  }String[] words1 =n2;

     //   System.out.println(Arrays.toString(words1));



