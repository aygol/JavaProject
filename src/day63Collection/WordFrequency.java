package day63Collection;

import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
     String str="Fun Fun Fun Java Java Java is Ending Tomorrow No It is Never Ending";
     String []allWords=str.split(" ");
     int wordCount=str.split(" ").length;
     //we want to use using the Map
    //because Map only have unique key ,so we can use it for unique word
    //first create Map object HashMap implementation
        Map <String,Integer>wordFreMap=new HashMap<>();
        //Lopp through the word array
    for(String currentWord:allWords) {
        if(wordFreMap.containsKey(currentWord)==false){
      wordFreMap.put(currentWord,1) ;

        }else{
            //int newCount=wordFreMap.get(currentWord)+1;
            //wordFreMap.replace(currentWord)+1
            wordFreMap.replace(currentWord,wordFreMap.get(currentWord)+1);
        }

    }
        System.out.println("wordFreMap = "+wordFreMap);
    //check if we already have the word in the key or not
    //so the count will be 1 add using put method
    //else it means we already have it in the key
    //so we get existing count using that key
    //and replace the old count using that key
    //and replace the old count value with new count value by incrementing by 1

    }
}
