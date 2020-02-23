package homeWork;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
//Ask user to enter valid email address
//        for example :
//        JSnow@NightWatch.com or
//        Arya@KingsLanding.edu
//        print 3 part of the email separately
//        for example :
//        Part1 -> JSnow  Part2 -> NightWatch Part3 ->com
//        Part1 -> Arya   Part2 -> KingsLanding Part3 ->edu
        Scanner scan=new Scanner(System.in);
        System.out.println("Please type your email address");
        String email=scan.nextLine();
String part1= email.substring(0,email.indexOf("@"));
        String part2= email.substring(email.indexOf("@")+1,email.indexOf("."));
String part3=email.substring(email.indexOf(".")+1);
System.out.println("Part 1 "+part1);
       System.out.println("Part 2 "+part2);
       System.out.println("Part 3 "+part3);

    }
}
