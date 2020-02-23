package homeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Reply126 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[]splitStr=str.split(",");
        String shortWord=splitStr[0];
        int shortWordLength=splitStr[0].length();
        for(int i=0; i<splitStr.length;i++){
            if(shortWordLength>splitStr[i].length()) {
                shortWord=splitStr[i];}}
        for(int i=0; i<splitStr.length;i++){
            if(shortWord.length()==splitStr[i].length()){
                shortWord+=splitStr[i];
            }

        }String[]shortStr=shortWord.split(" ");
        Arrays.sort(shortStr);
        System.out.println(Arrays.toString(shortStr));
    }
}
