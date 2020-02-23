package array_practice;

import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {

    } public static boolean isAnagram(String word1, String word2) {

    //    String str1=word1.toLowerCase();//make all of them lower case
    //    String str2=word2.toLowerCase();

     //   char[] ch1 =str1.toCharArray();  //make char array
     //   char[] ch2 = str2.toCharArray();
     //   Arrays.sort(ch1);
     //   Arrays.sort(ch2);
     //   boolean result=(Arrays.equals(ch1,ch2));
     //return result;}
    word1.toLowerCase();
    word2.toLowerCase();
    word1.replace(" ","");
    word2.replace(" ","");
    if(word1.length()!=word1.length()){
        return false;}
    else {
    return true;}
}}
