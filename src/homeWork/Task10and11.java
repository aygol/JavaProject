package homeWork;


import java.util.Scanner;

public class Task10and11 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter sentence with 3 words");
// Ask user to enter sentence with 3 words
//        For example I love Java
//        write a program to print second word

       String words=scan.nextLine();
        System.out.println("second word is "+words.substring(words.indexOf(" "),words.lastIndexOf(" ")));

    //    Task 11:
   //     Ask user to enter sentence with more than 1 word
    //    For example I love Java
   //     write a program to
    //    print first word and last word

        String firstWord=words.substring(0,words.indexOf(" "));
        String lastWord=words.substring(words.lastIndexOf(" "));
        System.out.println("first word "+firstWord+" and last word "+lastWord);




    }
}
