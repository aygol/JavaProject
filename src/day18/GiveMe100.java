package day18;

import java.util.Scanner;

public class GiveMe100 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give me $100");
        int money = scan.nextInt();
        while (!(money == 20 || money == 100)) {
            //   while(money!=100&&money!=20){
            System.out.println("Give me $20 or $100");
            money = scan.nextInt();
        }
        System.out.println("Thank you for " + money);
    }

}