import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BulkOperation {
    public static void main(String[] args) {
        System.out.println(isAnagram    ("hi", "bye"));
    isAnagram    ("listen", "Silent");
    }public static boolean isAnagram(String word1, String word2) {
            boolean anagram=false;
            if(word1.length()==word2.length()){
                char[] ArrayS1 = word1.toLowerCase().toCharArray();
                char[] ArrayS2 = word2.toLowerCase().toCharArray();
                Arrays.sort(ArrayS1);
                Arrays.sort(ArrayS2);
                anagram=  Arrays.equals(ArrayS1, ArrayS2);
                return anagram; }
            return anagram;


        }
    }





