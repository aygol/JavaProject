package day06;

public class MyfavorieNumber {
    public static void main(String[] args) {
        int myFavoriteNumber=300;
        int yourFavoriteNumber=myFavoriteNumber;
        System.out.println("My favorute number"+myFavoriteNumber);
        System.out.println("your favorute number"+yourFavoriteNumber);
        yourFavoriteNumber=100;
        System.out.println("My favorute number"+myFavoriteNumber);
        System.out.println("your favorute number"+yourFavoriteNumber);
String yourOrder= "Chicken salad";
String myOrder=yourOrder;

        System.out.println("Your order is"+" " +yourOrder);
        System.out.println("My order is"+" " +myOrder);
        myOrder= " Tuna Salad";
        System.out.println("Your order is"+" " +yourOrder+"\n"+"My order is"+" "+myOrder);

    }
}
