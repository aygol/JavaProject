package day26;

import java.util.Arrays;
import java.util.TreeSet;

public class ForEachLoop {
    public static void main(String[] args) {
        //write the program that check if the Strings build out same letters
        String str1="aabbc";//if I remove the duplicate I want to compare
        String str2="cabbccaabbbaa";
     String nonDuplicatedstr1=""; //Store the alll nin duplicated alphabe
        String nonDuplicatedstr2="";
   for(int i=0; i<str1.length();i++)  {
       if(!nonDuplicatedstr1.contains(str1.substring(i,i+1))){
           nonDuplicatedstr1+=str1.substring(i,i+1);}}
        //   System.out.println(nonDuplicatedstr1);
        for(int i=0; i<str2.length();i++)  {
            if(!nonDuplicatedstr2.contains(str2.substring(i,i+1))){
                nonDuplicatedstr2+=str2.substring(i,i+1);}}
//made a array and sort to compare the String
   char []ch1=nonDuplicatedstr1.toCharArray();//[abc}
        char [] ch2=nonDuplicatedstr2.toCharArray();//[cab]
      Arrays.sort(ch1);
      Arrays.sort(ch2);
      String stra=Arrays.toString(ch1);
      String strb=Arrays.toString(ch2);
        if(stra.equals(strb)) {
            System.out.println("it is build from same latter");
        }else


       System.out.println("not same  letters");
        //SHORTER  WAY  String str1="aabbc";              //if I remove the duplicate I want to compare
        //        String str2="cabbccaabbbaa";
str1=  new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
str2=  new TreeSet<String>(Arrays.asList(str2.split(""))).toString();
        System.out.println(str1.equals(str2));
    }

}
