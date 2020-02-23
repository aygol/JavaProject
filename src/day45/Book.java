package day45;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        //write your code below
        String result="";
        for(int x=0;x<s.length();x++)  {
            if(x%2!=0){
                result+= s.substring(x,x+1).toUpperCase();}
            else{result+= s.substring(x,x+1).toLowerCase();


            }
        }}}