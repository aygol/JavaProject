package homeWork;

import java.util.Arrays;

public class AnagramList {
    public static void main(String[] args) {
        System.out.println(isAnagram("Heart", "arteh") );


    } public static boolean isAnagram(String word1, String word2) {
            boolean anagram=false;
            if(word1.length()==word2.length()) {
                String wordx = word1.toLowerCase();
                String wordy = word2.toLowerCase();
             //   int count = 0;
                for (int i = 0; i < wordx.length(); i++) {
                    int count = 0;
                    for (int k = 0; k < wordx.length(); k++) {
                        if (wordx.charAt(i) == wordy.charAt(k)) ;
                        count++;
                    }if(count % 2 == 1);
                }
                //if (count % 2 == 1) {


                    return anagram;
                }return anagram;}}


