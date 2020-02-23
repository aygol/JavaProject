package day04;
import java.util.Scanner;
public class ReplyEx {
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
double height=scan.nextDouble();
       double weight=scan.nextDouble();
      boolean isMarried=scan.nextBoolean();
      long workPhoneNumber=scan.nextLong();
      Long personalPhoneNumber=scan.nextLong();

      System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        String firstName=scan.next();
        System.out.println("Enter your last name");

        String lastName=scan.next();
        String fullNmae=scan.next(firstName+lastName);
        System.out.println("Enter your email");
        String email=scan.next();

        System.out.println("Enter your street");
        String street=scan.next();
        System.out.println("Enter your city");
        String state=scan.next();
        System.out.println("Enter your state");
        String city=scan.next();
        System.out.println("Enter your zip code");
        int zipcode=scan.nextInt();
        String address=scan.next();
        String contacts=scan.next();
        int age=scan.nextInt();



/*
                -Display prompt "Enter your work phone number"
        7896542314

                -Display prompt "Enter your personal phone number"
        2406542314

                -Display prompt "Enter your age"
        35

                -Display prompt "Enter your height"
        5.10

                -Display prompt "Enter your weight"
        173.2

                -Display prompt "Are you married?"
        true



                -build contacts variable by concatenating work phone, personal phone and email
                -build fullName variable by concatenating first name and last name
                -build address variable by concatenating street, city, state, zip code

//this is should be an output in the console (terminal)

        Patient personal information
        Full name: May, James
        Address: 7925 Jones Branch Dr, McLean, VA 22102
        Contacts: work phone number - 7896542314, personal phone number - 2406542314,  email: jamesmay@gmail.com
        Age: 35
        Height: 5.1
        Weight: 173.2 pounds
        Married?: true*/


    }}
