package day25;

import java.util.Arrays;

public class String_Split_Method {
    public static void main(String[] args) {
        String sentence="I love Java";
        String[] allWords=sentence.split(" ");
        System.out.println("allwords = "+ Arrays.toString(allWords));
        System.out.println("how many word do I have in this sentence? :"+allWords.length);
        System.out.println("Last word of the sentence"+allWords[allWords.length-1]);
      String sentence2="Everyting is Awesome!!!" ;
      //split by letter e
        String []splitBy_e_Arr=sentence2.split("e");
        System.out.println("splitBy_e_Arr= "+splitBy_e_Arr);
        for(String eachpeaces:splitBy_e_Arr){
            System.out.println("eachPieces = <" +eachpeaces+" >");
       String [] splitByIs=sentence2.split("is");
            System.out.println("splitByIs "+splitByIs);
for(String eachsentence:splitByIs){
    System.out.println("eachsentence: "+splitByIs);
}

        }


    }
}
