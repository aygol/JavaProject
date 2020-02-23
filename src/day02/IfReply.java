package day02;


import java.util.Scanner;

public class IfReply {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //DO NOT CHANGE ABOVE CODE!  Write your code below
        if(word.equals(word+"y")){
            System.out.println(("-ies"));
        }else	if(word.equals(word+"ey")){
            System.out.println(("-eys"));

        }else if(word.equals(word+"ife")){
            System.out.println("-ives");
        } 	else{
            System.out.println("s");

        }
    }}