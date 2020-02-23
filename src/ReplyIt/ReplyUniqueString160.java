package ReplyIt;

import java.util.Scanner;

public class ReplyUniqueString160 {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    //int size = scan.nextInt();
    //String[] words = new String[size];
    // for(int i=0; i < size; i++){
    //     words[i] = scan.next();
    String[] words = {"java", "code", "python", "code", "rust", " code", "rust"};

    printUniqueWords(words);
}

    public static void printUniqueWords(String[] words){
        //WRITE YOUR CODE HERE

        for (int i = 0; i < words.length; i++) {
            int equalCount = 0;
            for (int k = 0; k < words.length; k++) {
                if (words[i].equals(words[k])) {
                    equalCount++;
                }
            }
            if (equalCount == 1) {
                System.out.println(words[i]);
            }
        }
    }                         }

