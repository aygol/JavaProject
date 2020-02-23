package ReplyIt;

import java.util.Scanner;

public class Reply90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Split:");
        String split = sc.next();
        System.out.println("Number of people:");
        int numberOfPeople = sc.nextInt();
        System.out.println("Check amount:");
        double checkAmount = sc.nextDouble();
        System.out.println("Service Quality:");
        String serviceQuality = sc.next();
        double tip;
        String people = "";
        for (int i = 1; i <= numberOfPeople; i++) {
            people += "&";
        }

        System.out.println("Number of people entered:" + people);
        System.out.println("Total to pay:" + checkAmount);
        //   Total tip: 119.0
        //   Total per person: 148.75
        //   Tip per person: 29.75
        double totalPay;
        double totaltip = 0;
        if (serviceQuality.equalsIgnoreCase("Fair")) {
            totaltip = checkAmount * 0.1;
            totalPay = checkAmount + totaltip;

        } else if (serviceQuality.equalsIgnoreCase("Good")) {
            totaltip = checkAmount * 0.15;
            totalPay = checkAmount + totaltip;
        } else if (serviceQuality.equalsIgnoreCase("Great")){
            totaltip = checkAmount * 0.20;
        totalPay = checkAmount + totaltip;
    }   else  if(serviceQuality.equalsIgnoreCase ("Excellent") ){
                 totaltip=checkAmount*0.25;
        totalPay=checkAmount+totaltip;


    }}}





