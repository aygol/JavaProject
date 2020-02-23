package ReplyIt;

import java.util.Scanner;

public class replyJavaInWords {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.next();

        int len = word.length()-2;
        int diff = 0;
        for(int i = 0; i < len; i++) {

            if(word.charAt(i) == 'j'&&word.charAt(i+1) == 'a' && word.charAt(i+2) == 'v'&& word.charAt(i+3)=='a'){
                    diff++;

            }
        } System.out.println(diff);
    }                            }
