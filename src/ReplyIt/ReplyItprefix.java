package ReplyIt;

import java.util.Scanner;

public class ReplyItprefix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);///soru yanlis

        String str = scan.next();
        int n = scan.nextInt();
String prefix=str.substring(0,n);
     int   count=0;
        for (int i = 0; i <= str.length()-(n) ; i++) {
           // if (prefix.equals(str.substring(i, i + n))) {//if (str.substring(i, i+n).equals(pre))
            if (str.substring(i, i+n).equals(prefix)) {
                count++;

            }else   if (count == n) {
                    System.out.println("true");

                } else {
                    System.out.println("false");
                }




        }}}


