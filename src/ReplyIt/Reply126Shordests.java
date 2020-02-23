package ReplyIt;

import java.util.Arrays;
import java.util.Scanner;

public class Reply126Shordests {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] shortstr    =str.split(", ");//split with space and coma
        String shorddest="";
        String min=shortstr[0];
        for(String each:shortstr){
            if (each.length()<min.length()){
                min=each;}}
        for( String eachword:shortstr) {
            if(eachword.length()==min.length())  {
                shorddest+=eachword+" ";
            }
        }String shortWord=shorddest.trim();
        String[]str2=shortWord.split(" ");
        Arrays.sort(str2);
        System.out.println( Arrays.toString(str2));


    }
}


