package array_practice;

import java.util.Arrays;
import java.util.*;

public class Reply211ISANAGram {
    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "Silent") );
    }

    public static boolean isAnagram(String word1, String word2) {

String str1=word1.toLowerCase().replace(" ","");//make all of them lower case
String str2=word2.toLowerCase().replace(" ","");

        char[] ch1 =str1.toCharArray();  //make char array
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean result=(Arrays.equals(ch1,ch2));
    return result;}
}