package day17;

import java.util.Scanner;

public class NmaePrinter {
    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);

        System.out.println("Enter your name" );
        String name=scan.next();
        int x=0;
       while(x<=name.length()-1) {
           System.out.println(name.charAt(x));
        ++x;
    }









    }
}
