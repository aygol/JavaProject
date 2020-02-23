package day13;

import jdk.swing.interop.SwingInterOpUtils;

public class WarmUP_Amazon {
    public static void main(String[] args) {

    String memberType="Prime member";
      double amount=15.99d;
      int shippingFee=0;
      if (memberType.equalsIgnoreCase("PRIME MEMBER")) {

          System.out.println("YOU GET 1 DAY FREE SHIPPING!!!");
          System.out.println("your finel price is " + amount);

      } else if (amount>25) {

          }
          System.out.println("you are not prime member ");
          System.out.println("your final price is " + amount);


      }}

