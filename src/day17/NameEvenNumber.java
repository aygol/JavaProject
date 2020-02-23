package day17;

import java.util.Scanner;

public class NameEvenNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your name" );
        String name=scan.nextLine();
        int x=name.length()-1;
        while(x>=0) {

            if(x%2 ==0)
                System.out.println(name.charAt(x));
            --x;
    }}
}
