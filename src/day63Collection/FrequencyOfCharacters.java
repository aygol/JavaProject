package day63Collection;
import java.util.*;
public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str="AAABBBBBACCRDDD";
//if we do not have Character we add character
        //if we have the character increase the existing count by 1
        // and replace the value   with new value
        Map<Character,Integer>frequency=new HashMap<>();

       for(int x=0;x<str.length();x++){
           char currentChar=str.charAt(x);

        if (!frequency.containsKey(currentChar)){
            frequency.put(str.charAt(x),1);
        }else{
            System.out.println("Incrementin the count "+currentChar+" by one and "+"replacing old count "

        +frequency.get(currentChar)    );
            frequency.replace(currentChar,frequency.get(currentChar)+1);

        }

        }
        System.out.println("frequancy "+frequency);

    }
}
