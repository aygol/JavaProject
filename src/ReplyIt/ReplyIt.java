package ReplyIt;

import java.util.Scanner;

public class ReplyIt {
    public static void main(String[] args) {//input: mike_tyson@gmail.com
        //  output: tyson_mike@gmail.com

        //   Example:
        //   input: barakobama@gmail.com
        //   output: barakobama@gmail.com
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        if (email.contains("_")) {
            email=email.substring(email.indexOf("_")+1,email.indexOf("@"))+"_"+email.substring(0,email.indexOf("_"))+
       ""+email.substring(email.indexOf("@"));
            System.out.println(email);
        }
    else{
            System.out.println(email);
        }
}
}