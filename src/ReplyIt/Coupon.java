package ReplyIt;

import java.util.Scanner;

public class Coupon {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println( "Enter number of coupons:");
        int numberOfCoupons=scan.nextInt();
        int numberOfCandies=numberOfCoupons/10;
        int numberOfGamballs=numberOfCoupons%10/3;
        if(numberOfCoupons>=3) {
            System.out.println("Number of Candies: " + numberOfCandies);
            System.out.println("Number of Gumballs: " + numberOfGamballs);
        }else System.out.println("Not enough coupons");


    }







}
