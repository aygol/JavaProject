package day21;

import java.util.Scanner;

public class JavaPhyton {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int  countJava=0;
        int countPyton=0;
        String sentencePyton=sentence;

        while(sentence.contains("java")){
  sentence=sentence.substring(sentence.indexOf("java")+4);

            countJava++;
        }
        while(sentencePyton.contains("python")){
            sentencePyton=sentencePyton.substring(sentencePyton.indexOf("python")+5);
            countPyton++;

        }

        if( countJava==countPyton){
            System.out.println("true");
        }else{
            System.out.println("false");
        }




    }

}


