package day01;
import java.util.Scanner;
public class CafeineDose {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //12 ounceCup=34 mg caffeine;
        // 16 ounceCup=160 mg caffeine
        //  int cafeine=
        /*Scientists estimate that roughly 10 grams of caffeine consumed at one time is a
        lethal overdose.

        Write a program with a variable that holds the number of milli-
                grams of caffeine in a drink and outputs how many drinks it takes*/


        System.out.println("Enter number of miligrams in drink: ");

        int caffeine = scan.nextInt();
        int cafeinelethal;
        cafeinelethal = (10000 / caffeine);
        System.out.println("it would take about " + cafeinelethal + " drinks for a lethal overdose.");


    }

}




















