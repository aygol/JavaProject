package homeWork;

import java.util.Scanner;

public class CaracterPrintBetween {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1 st word with single character to start with? ");

        String first = scan.next();
        char firstChar = first.charAt(0);
        System.out.println("Enter 2 nd word with single character to end with? ");
        String second = scan.next();
        char secondChar = second.charAt(0);
        for (char ichar = firstChar; ichar <= secondChar; ichar++) {

            System.out.println(ichar + " ");


        }


    }
}
