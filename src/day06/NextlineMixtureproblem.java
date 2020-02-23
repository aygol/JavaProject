package day06;
import java.util.Scanner;
public class NextlineMixtureproblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("What is your name?");
        String name=sc.nextLine();
        System.out.println("What is your age?");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println("Your name"+" "+name+" "+",and"+" "+"your age is"+" "+age);
        System.out.println("What is your address?");
        String address=sc.nextLine();
        System.out.println("your address is "+ address);


    }
}
