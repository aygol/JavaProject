package day01;

import java.util.Scanner;

public class Giftswitch {

public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        double totalBalance=100.00;
        double currentbalance;
        System.out.println("Choose item");
        String item=scan.nextLine();
switch (item){
    case"Smartphone":
            currentbalance = totalBalance - 300.00;
            System.out.println("Sorry, not enough funds on your gift card!");
       break;
       case "Laptop" :
            currentbalance = totalBalance - 400.00;
            System.out.println("Sorry, not enough funds on your gift card!");
            break;
    case"Charger":
            currentbalance = totalBalance - 15.00;
            System.out.println("Thank you for your purchase!");
            System.out.println(" Your current balance is: "+currentbalance+"$");
            break;
    case "USB Cable":
            currentbalance = totalBalance - 10.00;
            System.out.println("Thank you for your purchase!");
            System.out.println(" Your current balance is: "+currentbalance+"$");
            break;
    case "Headphones":
            currentbalance = totalBalance - 30.00;
            System.out.println("Thank you for your purchase!");
            System.out.println(" Your current balance is: "+currentbalance+"$");
            break;
    case "Socks":
        currentbalance = totalBalance - 5.00;
        System.out.println("Thank you for your purchase!");
        System.out.println(" Your current balance is: "+currentbalance+"$");
break;
    case "Pants":
            currentbalance = totalBalance - 50.00;
            System.out.println("Thank you for your purchase!");
            System.out.println(" Your current balance is: "+currentbalance+"$");
            break;
    case "Hat":
            currentbalance = totalBalance - 25.00;
            System.out.println("Thank you for your purchase!");
            System.out.println(" Your current balance is: "+currentbalance+"$");
break;

    case"Blanket":
            currentbalance = totalBalance - 60.00;
            System.out.println("Thank you for your purchase!");
            System.out.println(" Your current balance is: "+currentbalance+"$");
            break;
    case "Pillow":
            currentbalance = totalBalance - 40.00;
            System.out.println("Thank you for your purchase!");
            System.out.println(" Your current balance is: " + currentbalance + "$");
break;

    default:
            System.out.println("Invalid item!");
break;
        }}}
