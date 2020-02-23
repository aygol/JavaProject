package homeWork;

import java.util.Arrays;
import java.util.Scanner;

public class ReplyQuestion126 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] splited=str.split(", ");
        int smallestWordLenght=splited[0].length();
        String smallestWord="";



        for(int i=1;i<splited.length;i++){
            if(splited[i].length()<smallestWordLenght){
                smallestWordLenght=splited[i].length();
            }
        }
        for(int i=0;i<splited.length;i++){
            if(splited[i].length()==smallestWordLenght){
                smallestWord+=(splited[i]+" ");
            }
        }
        String[] splitedSmall=smallestWord.split(" ");
        Arrays.sort(splitedSmall);
        System.out.println(Arrays.toString(splitedSmall));





    }
}


