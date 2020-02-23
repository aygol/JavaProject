package day01;
import java.util.Scanner;
public class VendingMeshine {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter price in cents:");
         int itemPrice=scan.nextInt();


         int  quarterChange=(100-itemPrice)/25;
       int dimesChange=((100-itemPrice)%25)/10;
       int nickelChange=(((100-itemPrice)%25)%10)/5;
        String change=" ";
      // if (item
        if (itemPrice<25) {
            System.out.println("Invalid price!");

        } else if( itemPrice>100){
            System.out.println("Invalid price!");
        }if(itemPrice%5 !=0){
            System.out.println("Invalid price!");
        } if (itemPrice%5==0){
            //change += "Your change is " + quarterChange + " quarters; " + dimesChange + " dimes, and " + nickelChange + " nickels.";
            System.out.println("Your change is " + quarterChange + " quarters; " + dimesChange + " dimes, and " + nickelChange + " nickels.");
        }






    }
}
