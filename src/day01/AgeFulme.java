package day01;
import java.util.Scanner;
public class AgeFulme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = scan.nextInt();
        System.out.println("what is your name?");
        scan.nextLine();
        String name = scan.nextLine();
        System.out.println("your name " + name + " ,and your age is " + age);
        System.out.println("==========================");
        int[] num1 = new int[3];
        int[] num2 = {1, 2, 3, 4, 5};
        num1 = num2;

        for (int i = 0; i < num1.length; i++) {

            System.out.println(num1[i]);
        }
    }}

