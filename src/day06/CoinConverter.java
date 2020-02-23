package day06;

public class CoinConverter {
    public static void main(String[] args) {
        //you have $2 *how many dime you can get*how many quarter;nickel 5c how many dime 10c how many penny you can get
        int dollar=2;
        int cent=dollar*100;
        cent-=74;
        int quarter=cent/25;
        //int penny=cent%25;
        System.out.println(quarter);
        //System.out.println(penny);
        //System.out.println("my remain money is "+quarter+"quarter and"+" "+penny+" "+"penny");
       // int dime=cent/10;
        //int penny=cent%10;
        //System.out.println("my remain money is "+dime+ " "+"dime and"+" "+penny+" "+"cent");
        int nickel=cent/5;
        int penny=cent%5;
        System.out.println("my remain money is "+nickel+ " "+"nickel and"+" "+penny+" "+"cent");

        System.out.println();
       // you have purchase candle for 0.74 cent, what would be your remainder

    }
}
