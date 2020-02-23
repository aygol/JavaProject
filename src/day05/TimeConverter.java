package day05;
import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       /* System.out.println("What is the temprature in F?");
        double fahrenheit=input.nextDouble();
        double celsius=(5.0/9)*(fahrenheit-32);
        System.out.println("fahrenheit"+" "+fahrenheit+" "+"is " +celsius+" "+"in celsius");*/
        System.out.println("How many days do want to convert to minute?");
        int days=input.nextInt();
       int minute = days *(24*60);

        System.out.println(days+" "+"days"+" "+" is"+" "+ minute+" "+"minute");







    }
}
