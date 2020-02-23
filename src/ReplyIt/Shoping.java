package ReplyIt;

import java.util.Scanner;

public class Shoping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;
        do {
            System.out.println("Enter Item"+count+ " and its price:");
            item = scan.next();
            price = scan.nextDouble();
            totalPrice += price;
            System.out.println("Add one more item?");
            countinue = scan.next();
            shoppingListReport += "Item" + count + " " + item + " Price: " + price+",";
            count++;
        } while (countinue.equals("yes")) ;

        System.out.println(shoppingListReport.substring(0,shoppingListReport.lastIndexOf(",")));
        System.out.println( "Total price: "+ totalPrice);


    }
}





