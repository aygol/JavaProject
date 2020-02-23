package ReplyIt;

import java.util.Arrays;
import java.util.Scanner;

public class Rep140 {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


    String words1="";
    for(int i=0; i<words.length;i++) {
        for (int j = 0; j < words[i].length(); j++) {
           // words1 += words[i].charAt(0) + "" + words[i].charAt(words[i].length() - 1) + " ";
        }  words1 += words[i].charAt(0) + "" + words[i].charAt(words[i].length() - 1) + " ";

    }words1.trim();

    String [] words2=words1.split(" ");


    System.out.println(Arrays.toString(words2));
}}




