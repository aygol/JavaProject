package day25;

import java.util.Arrays;

public class SplitIIn_Arrrray {
    public static void main(String[] args) {
        String sentence= "Everything is Awesome!!!";
     String [] splitBy_e =sentence.split("e");
        System.out.println("splitBy_e "+ Arrays.toString(splitBy_e));

   for(String eachsentence:splitBy_e)  {
       System.out.println("eachsentence=< "+eachsentence);
   }
        String []sentenceIS=sentence.split("is");
        System.out.println("sentenceIS "+Arrays.toString(sentenceIS));


    }
}
