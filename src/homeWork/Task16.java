package homeWork;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
//        Enter user to ask two words
//        and store it into word1 word2 String variables
//        if word1 contains word2 ,
//                print the location of word2 in word1
//        for example ABCDE , BC  -->> BC is at index 1 in word1
//        then replace word2 part of word1 with ZZZ
//        for example ABCDE , BC  -->> AZZZDE
//        if word2 exists in word1 , replace word1 with ZZZ
//        for example BC , ABCDE    -->> AZZZDE
//
        Scanner scan = new Scanner(System.in);

        System.out.println("enter word with two words");
        String word1=scan.next();
        String word2=scan.next();
   if(word1.contains(word2)){ //     if (word1.contains(word2)) {
       System.out.println("the location of word2 in word1 "+word1.indexOf(word2));
       System.out.println(word1.replace(word2,"ZZZ"));
   }else if(word2.contains(word1)){
       System.out.println("the location of word1 in word2 "+word2.indexOf(word1));
       System.out.println("word2"+word2.indexOf(word1));//     if (word2.contains(word1)) {
       System.out.println(word2.replace(word1,"ZZZ"));


   }



    }
}
