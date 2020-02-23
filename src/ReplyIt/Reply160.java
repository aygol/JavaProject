package ReplyIt;

import java.util.Scanner;

public class Reply160 { public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();
    String[] words = new String[size];
    for(int i=0; i < size; i++){
        words[i] = scan.next();
    }
    printUniqueWords(words);
}

    public static void printUniqueWords(String[] words) {
        //WRITE YOUR CODE HERE
        String str="";
        for (int i = 0; i < words.length; i++) {
if(!words[i].equals(words[i+1])){
str=words[i]+"\n";
        }
            System.out.println(str);

    }}}


