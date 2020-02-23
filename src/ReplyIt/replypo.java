package ReplyIt;

import java.util.Scanner;

public class replypo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int freeBooks = 0;
        boolean isPremiumCustomer = scan.nextBoolean();
        int nbooksPurchased = scan.nextInt();
        if(isPremiumCustomer=true) {
          if (nbooksPurchased > 7)
                System.out.println("2");
             if (nbooksPurchased > 4)
                 System.out.println("1");

              else {
                 System.out.println("0");
              if(isPremiumCustomer=false) {
                if (nbooksPurchased > 11)
                    System.out.println("2");

                    if (nbooksPurchased > 6)
                        System.out.println("1");


                     else {
                        System.out.println("0");
                    }}}}}}



