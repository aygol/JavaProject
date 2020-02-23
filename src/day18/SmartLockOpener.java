package day18;

import java.util.Scanner;

public class SmartLockOpener {
    public static void main(String[] args) {

   //smart lock door has password unless you enter correct pasword
   //it keep locking you out
   //assuming correct password is B15
        Scanner scan=new Scanner(System.in) ;
        System.out.println("Knock knock!!");
        System.out.println("What is the password?");
        String pasword=scan.next();
        while(!pasword.equals("B15")){//        while(!pasword.equalsIgnoreCase("B15")

            System.out.println("Wrong Password!! Enter Again:");
            pasword=scan.next();

        }
        System.out.println("Open Seseame!!!");


    }
}
