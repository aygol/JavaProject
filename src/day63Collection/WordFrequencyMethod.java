package day63Collection;

import java.util.*;

public class WordFrequencyMethod {
    public static void main(String[] args) {
        String str= "Fun Fun Fun Java Java Java is Ending Tomorrow No It is Never Ending";
        System.out.println("get FrequencyMap(str = "+getFrequencyMethod(str));

    }
    public static Map<String ,Integer> getFrequencyMethod(String str){
     Map <String,Integer>wordFreMap=new HashMap<>() ;
     String []allWords=str.split(" ");
     for(String word:allWords){
      if(!wordFreMap.containsKey((word))) {
          wordFreMap.put(word, 1);
      }else{
          //if we come to this point it means we already have the key and value
          //get old count value for the word
          Integer oldCount=wordFreMap.get(word);
          //then replace it by incrementing by 1
          wordFreMap.replace(word,wordFreMap.get(word)+1);

      }
     }return wordFreMap;
    }
}
