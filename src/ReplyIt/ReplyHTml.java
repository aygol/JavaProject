package ReplyIt;

import java.util.Scanner;

public class ReplyHTml {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String html = scan.nextLine();
        if(!html.contains("<html>") ){
            System.out.println("Invalid input!");
        }else if(html.contains("<html>")){

            System.out.println(html.substring(html.indexOf("\"")-3,html.lastIndexOf("\"")));

        }
    }}


