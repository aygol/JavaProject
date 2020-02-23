package aTekrar;

import java.util.Scanner;

public class Give_Cube {


//	9_04 Ask user for a  number, print the cube of the number,
//		 do this repeatedly until user enters a negative number

    public static void  printCubeOfNuberEnteredByUser() {
    int num=0;
     do{   System.out.println("please enter the number");
        Scanner scan=new Scanner(System.in);
         num=scan.nextInt();
         System.out.println((int)Math.pow(num, 3));}
      while( num>=0);}

    public static void main(String[] args) {
        printCubeOfNuberEnteredByUser();
    }





                }
