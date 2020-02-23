package day18;

import java.util.Scanner;

public class WhileDoKnock {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Knock Knock!!");
        String password;
        do {
            System.out.println("What's The Password?");

            password = scan.next();
        }while(!password.equals("B15"));
        System.out.println("Doors is open!!!");



    }
}
