package day06;
import java.util.Scanner;
public class Ders6 {
    public static void main(String[] args) {
        Scanner blabla=new Scanner(System.in);
        System.out.println("What is your name?");
        String name=blabla.nextLine();
        System.out.println("You entered "+name);
        System.out.println("Which city you live in, including state?");

        String city=blabla.nextLine();
        System.out.println("What is your street?");
        String adresses=blabla.nextLine();
        System.out.println(name+" address is "+adresses+ " " +city);
    }
}
