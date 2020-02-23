package ReplyIt;

import java.util.Scanner;

public class Reply77 {
    public static void main(String[] args) {//Input: craig_federighi@apple.com
       // Output:
      //  First name: Craig
      //  Last name: Federighi
     //   Domain: apple
     //   Top-Level Domain: com
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String firstName= email.toUpperCase().charAt(0)+""+email.substring(1,email.indexOf("_"));
        String lastName= email.toUpperCase().charAt(email.indexOf("_")+1)+""+email.substring(email.indexOf("_")+2,email.indexOf("@"));
String domain=email.substring(email.indexOf("@")+1,email.indexOf("."));
        String  topLevelDomain=email.substring(email.indexOf(".")+1);
        System.out.println("First name: "+firstName);
        System.out.println("Last name: "+lastName);
        System.out.println("Domain: "+domain);
        System.out.println("Top-Level Domain: "+topLevelDomain);
    }

}
