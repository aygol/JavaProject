package day08;
import java.util.Scanner;
public class Iflsetatement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your current speed?");
        int currentSpeed = scan.nextInt();
        System.out.println("what is speed Limit");
        int speedLimit=scan.nextInt();
        if(currentSpeed>= speedLimit){
            System.out.println("Get pulled over by the police");
            System.out.println("given ticket by the police");
            System.out.println("taken away some points on your license");
            System.out.println("go to court");}
       else {
            System.out.println("Have a great day");
       }  {

    }
}}
