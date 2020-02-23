package day13;

public class AmazonShopingcalculater {
    public static void main(String[] args) {

        //amazon has 2type user one is Prime member and another is regular member prime member get free shipping in all purchase no matter the amount
        //regular member user get free shipping only iftheir purchase if their purchase is more than 25$  otherwise they get 5$ shipping fee

        String memberType="Prime member";
        double amount=15.99d;
        int shippingFee=0;
        if ( memberType.equalsIgnoreCase("PRIME MEMBER")) {

            System.out.println("YOU GET 1 DAY FREE SHIPPING!!!");
            System.out.println("your final price is " + amount);
        } else if (!memberType.equalsIgnoreCase("PRIME MEMBER")&&amount>25) {
            System.out.println("NOT PRIME MEMBER BUT YOU ORDER IS MORE THAN 25");
            System.out.println("YOU GOT FREE SHIPPING ON AMOUNT" + amount);
        }else {


            System.out.println("DO YOU WANT TO SIGN UP FOR PRIME MEMBERSHIP? ");
           shippingFee=5;
           amount=amount+shippingFee;
            System.out.println("your final price is " + amount);
        }














    }
}
