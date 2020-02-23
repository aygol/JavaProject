package day24;

import java.util.Arrays;

public class DoubleArray {
    public static void main(String[] args) {
        double[] prices = {25.50, 100.0, 15.25};
        System.out.println(Arrays.toString(prices));
        String pricesString = Arrays.toString(prices);
        System.out.println("Price String= " + pricesString);
        for (int i = 0; i < pricesString.length(); i++) {
            System.out.println("Charecter at index " + i + " is " + pricesString.charAt(i));


        }
    }
}