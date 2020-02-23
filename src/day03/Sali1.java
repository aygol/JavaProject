package day03;

import java.sql.SQLOutput;

public class Sali1 {
    public static void main(String[] args) {

        byte letterCount= 26;
        short sheepCount= 300;

        int catCount= 20;
        long mileToSun= 10000000L;
          long mileTosun= 5000000L;
          //you must add f at the and of the number this is float data type//uppercase lowercase lowercase does not matter.
        float priceOfBanana= 1.99f;
        float priceOfPotato= 2.49F;
        //larger floating point numbers
        double priceOfIpad1 =355.99d;
        double priceOfIpadpro =1024.99D;
        double priceOfMac = 22999.99;
        //if you have a whole number by itself complier aoutamtically asssume it's an int
        //if you have a fractional number fractional nmber by itself complier automaclly assuem it's an double
        System.out.println("the alphabe have" +" "+ letterCount);
        System.out.println("The cat in the street " + ""+ catCount);
        System.out.println("sky ship has to go "+" " + mileToSun);
        System.out.println("There are " + " "+ sheepCount +""+"sheep");
        System.out.println("Is there any  banana than "+" "+ priceOfBanana);
        System.out.println(" Ipad coast me " + " " + priceOfIpadpro);
        System.out.println("you can buy Mac "+""+ priceOfMac+ "from best buy");
        char grade ='A';
        char emailSign= '@';
        System.out.println("My math score is " +""+ grade );
        System.out.println();
        boolean isLightOn= true;
        boolean areYouSleeping;
        System.out.println("Did you turn off the Light ?  :" +" "+ isLightOn);
        System.out.println("");
    }
}
