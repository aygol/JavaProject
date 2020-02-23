package homeWork;

import java.util.Scanner;

public class TotalPay {
    public static void main(String[] args) {
    /*    Write your code inside the method.
       */
    Scanner sc=new Scanner(System.in);


        double  tip;
String countPeople="";
        System.out.println("Number of people:");
        int numberOfPeople=sc.nextInt();
for(int i=0; i<=numberOfPeople;i++ ) {
    countPeople = countPeople + "&";

}System.out.println("Service Quality:");
        String serviceQuality=sc.next();
        System.out.println("Check amount:");
        double checkAmount=sc.nextDouble();

        if(serviceQuality.equalsIgnoreCase("Poor")) {
           double totalTip = checkAmount * 0.05;
         if(serviceQuality.equalsIgnoreCase("Fair")) {
             totalTip=checkAmount*0.1;
                  if(serviceQuality.equalsIgnoreCase("Good")){
                   totalTip=checkAmount*0.15;
                   if(serviceQuality.equalsIgnoreCase("Great")) {
                       totalTip = checkAmount * 0.2;
                       if (serviceQuality.equalsIgnoreCase("Excellent")) {
                           totalTip = checkAmount * 0.25;
                           System.out.println("Number of people entered: "+countPeople);
                           System.out.println("Split:");
                           String split=sc.next();
                           if(split.equalsIgnoreCase("yes")){
                           double totalPay = checkAmount + totalTip;
                           System.out.println("Total to pay: " + totalPay);
                           System.out.println("Total tip: " + totalTip);
                           System.out.println("Total per person" + totalTip / numberOfPeople);
                           System.out.println("Tip per person: " + totalTip / numberOfPeople);
                       }

                   }}}}}}}




