package homeWork;

import java.util.Scanner;

public class FINdingLongestName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};
        String   shortestName=str[0];
        int shortestNameLength=(str[0]).length();
        for (String eachstr: str){
            if (eachstr.length()<shortestNameLength){
                shortestName=eachstr;
            } }

        System.out.println( shortestName);

    }
    }

