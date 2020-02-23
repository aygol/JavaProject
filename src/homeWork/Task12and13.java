package homeWork;

import java.util.Scanner;

public class Task12and13 {
    public static void main(String[] args) {
       // Given a String with at least two characters
      //  swamp first character with last character
       // for example
      //  Java --> aavJ , Kawap --> pawaK
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a word");
String word=scan.next();
        System.out.println(word.charAt(word.length()-1)+""+word.substring(1,word.length()-1)+""+word.charAt(0));

//  Task 13:
//        Given a String with 3 characters
//        swamp first character with last character
//        and check whether new String is same as old one
//        if so print Palindrome
        System.out.println("please give me word with 3 characters");
        String word1=scan.next();
       String word2= word1.charAt(2)+""+word1.charAt(1)+word1.charAt(0);
        if(word1.equals(word2)){
            System.out.println("Palindrome");
        }else{
            System.out.println(word1+" "+word2+" not the same");
    }
}}
