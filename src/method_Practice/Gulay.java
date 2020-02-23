package method_Practice;

import java.util.Arrays;

public class Gulay {
    public static void main(String[] args) {
        String sentence = "I like book, I read book, book book book";
   String repSentence=    sentence.replace(",","");
       String [] str=repSentence.split(" ");
        System.out.println(str);
        System.out.println("method "+Arrays.toString(str));
        int count =0;

        for(String each:str){
            if(each.equals("book")){
            count++;
            }}
        System.out.println(count);

}}
