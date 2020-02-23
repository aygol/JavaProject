package ReplyIt;

import java.util.Scanner;

public class replyGuest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer="";
        String name="";
String guest="";
        do {
            System.out.println("Please enter guest name:");
            name = input.next();
            guest = name + ",";
            System.out.println("Do you want to enter new guest name:");
            answer = input.next();


        } while (answer.equals("yes")) ;


                System.out.println("Guest's list: " + guest);

            }}
