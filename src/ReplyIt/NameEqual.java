package ReplyIt;

import java.util.Scanner;

public class NameEqual {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE
        System.out.println("Enter full name:");
        String fullname=scan.nextLine();
        if(fullname.equalsIgnoreCase("Max Payne")) {
            System.out.println("User found!");
        }else if( fullname.equalsIgnoreCase("Alan Wake")) {
            System.out.println("User found!");

        }else {
            System.out.println("User not found!");

        }













    }
}
