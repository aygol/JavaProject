package homeWork;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
//Ask user to enter a valid URL in below format
//        www.blackfriday.com
//        Write a program to print first Index of .(dot)
//                and last index of .(dot)
//                and eventually print the domain
//        for example :
//        www.nightwatch.com  --->> blackfriday
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a valid URL");
        String url=scan.nextLine();
        System.out.println(url.substring(url.indexOf(".")+1,url.lastIndexOf(".")));






    }
}
