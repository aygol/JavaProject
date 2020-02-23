import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//sadece harfleri reverse yap //karakterlri do not reverse
public class day15 {
    public static void main(String[] args) {
        String word="ght%%juxm((( \"";
        System.out.println(    reverseLetters(word));
    }
        public static String reverseLetters(String word){
//TODO String word=" ght%%juxm((( ";
            String result ="";
            List<String> temp= new ArrayList<>();
            for(int i=0 ;i<word.length(); i++) {
                if (Character.isLetter(word.charAt(i)))
                    temp.add("" + word.charAt(i));
                System.out.println(temp);
            }
            Collections.reverse(temp);
            for (int i = 0 , k=0 ; i <word.length() ; i++) {
                if(Character.isLetter(word.charAt(i))){
                    result+=temp.get(k);
                    k++;
                }else {
                    result+=word.charAt(i);
                }
            }
            return result;

        }}

