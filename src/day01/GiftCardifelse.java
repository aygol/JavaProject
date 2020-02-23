package day01;
import java.util.Scanner;
public class  GiftCardifelse {
    public static void main(String[] args) {
       int number=9 ;
       if(number%5==0&&number%3==0) {
           System.out.println("FizzBuzz Number");
       } else if( number %5==0 && number%3 !=0) {
           System.out.println("Fizz Number");

       }else if(number%3==0 && number%5 !=0) {
           System.out.println("Buz number");
       }  else
           System.out.println("NOT MY NUMBER!!!");

}



    }  