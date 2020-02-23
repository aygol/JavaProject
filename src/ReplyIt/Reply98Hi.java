package ReplyIt;

import java.util.Scanner;

public class Reply98Hi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int len = str.length()-1;
        int diff = 0;
        for(int i = 0; i < len; i++) {

            if(str.charAt(i) == 'h'&& str.charAt(i+1) == 'i'){
                diff++;

            }
        }

        System.out.println(diff);

    }
}
