package day16;

import java.util.Scanner;

public class Day16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a word that have 4 character!");
        String word1 = scan.next();

        char[] chars = word1.toCharArray();
        int length = chars.length;
        // System.out.println( word1.charAt(3)+""+word1.charAt(2)+""+word1.charAt(1)+""+word1.charAt(0));
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}