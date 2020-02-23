package day06;
import java.util.Scanner;
public class Remainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       /* System.out.println(5/2);
        System.out.println(5.0/2);
        System.out.println(5.0/2f);
        System.out.println(5%2);
        System.out.println(99%10);*/
/*declare variable called minutes data type int print the result in x hours y minutes format
for example 135minutes 2 hours 15 minutes*/


     int minute=135;
      int hour= 135/60;
      int minutes= minute%60;

        System.out.println("What is your reading time as a minute in aday");
     //   int minute=sc.nextInt();
        System.out.println("Your reading Time is "+hour+" "+" hour"+" "+minutes+" "+"minutes");



    }
}
