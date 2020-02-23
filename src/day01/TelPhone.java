package day01;
import java.util.Scanner;
public class TelPhone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("area code");

   int areaCode=scan.nextInt();
        System.out.println("Local Number");
    int localNumber = scan.nextInt();

    String phoneNumber = "("+areaCode + ")"+ "-"+ localNumber;
        System.out.println("Calling number"+" "+phoneNumber);
                //Write a program that asks user to input int values: areaCode and localNumber.
        //
        //-Using concatenation put together in this format and assign to String phoneNumber  variable:
        //
        //-(222)-3334444
        //
        //-Write a print statement that displays (use phoneNumber variable ):
        //Calling number (222)-3334444
}}