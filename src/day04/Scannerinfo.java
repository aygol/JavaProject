package day04;

import java.util.Scanner;

public class Scannerinfo {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            // Iwant to save users input after asking some questions
            //and I want to save this input so i can do something with it


            System.out.println("Enter your first name please : ");
            String firstName= scan.next();
            System.out.println("You have entered : " + firstName);
            System.out.println("What is your age : ");
            int age = scan. nextInt();
            System.out.println("your age is: " + age);
}}
