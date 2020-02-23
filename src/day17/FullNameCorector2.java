package day17;

import java.util.Scanner;

public class FullNameCorector2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("give me your name?");
        String fullName=scan.nextLine();


        System.out.println(fullName.toUpperCase().substring(0,1)+""+fullName.toLowerCase().substring(1,fullName.indexOf(" "))+" "+fullName.toUpperCase().substring(fullName.indexOf(" ")+1,fullName.indexOf(" ")+2)+""+fullName.toLowerCase().substring(fullName.indexOf(" ")+2));



    }
}
