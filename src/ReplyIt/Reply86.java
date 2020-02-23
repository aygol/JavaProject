package ReplyIt;

import java.util.Scanner;

public class Reply86 {
    public static void main(String[] args) {
        //Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
        //Ask for the first guest name.
        //Then ask does user want to enter one more guest.
        // If yes - take input from.
        //If not - finish the program and print list of the guests.
        //Please enter guest name:
        //Nick
        //Do you want to enter new guest name:
        //yes
        //Please enter guest name:
        //Linda
        //Do you want to enter new guest name:
        //no
        //Guest's list: Nick, Linda
        Scanner input = new Scanner(System.in);//guest=scan.nextLine();
        //  String listOfGuests+=guest;
        String x = "";
        String guestName;
        do {
            System.out.println("Please enter guest name:");
            guestName = input.next();
            System.out.println("Do you want to enter new guest name:");
            x = input.next();
        } while (x.equals("yes"));
        //   System.out.println("Guest's list: "+guestName);
//int guestCount=0;
//for(guestCount=0)


    }}