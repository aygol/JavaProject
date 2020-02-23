package homeWork;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
//Given a String str with 3 characters:
//        for example : DEV
//        Store each character into 3 char variables
//        Store ASCII number of each character into int variables
//        hint : store char into int to get ASCII number
//        Then print it out by concatenating as below :
//        "DEV IS NOW --> D68E69V86"
//
//
        Scanner scan = new Scanner(System.in);

        System.out.println("enter word with 3 characters");
        String word = scan.next();
 int charAt =word.charAt(0);int charAt1=word.charAt(1); int charAt2 =word.charAt(2);

        System.out.println(word.charAt(0) + "" +  charAt  + word.charAt(1) + "" + charAt1+ "" + word.charAt(2) + "" + charAt2);

    }
    }


