package homeWork;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {

       // Ask user to enter sentence with any number of words
        //        For example I love Java Java Java Java
        //        write a program to print last word
        //        remove last word from the sentence
        //        check weather remaining part still contains last word
        //        for example :
        //        1, I love Java Java Java Java  -->> Java
        //        2, I love Java Java Java
        //        3, I love Java Java Java still contains last word

        Scanner scan=new Scanner(System.in);

        System.out.println("enter sentence with any number of words");
        String sentence=scan.nextLine();
 String sentence1=      sentence.substring(0,sentence.lastIndexOf(" "));
 String lastWord=sentence.substring(sentence.lastIndexOf(" "));
        System.out.println(lastWord);
        System.out.println(sentence1);
        if (sentence.contains(lastWord)) {
            System.out.println(sentence1 + " " + "contains " + lastWord);
        }  else  {
            System.out.println("It does not contains "+lastWord);
        }
    }
}
