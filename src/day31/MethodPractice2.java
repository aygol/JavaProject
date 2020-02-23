package day31;

import org.w3c.dom.ls.LSOutput;

public class MethodPractice2 {
    public static void main(String[] args) {
        count1to100();
   countDownFrom20();
   printOddNumbers1to100();
spellingName();
    }

    public static void count1to100() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
        //Create a method called countDownFrom20
        //Create a method to print odd numbers from 1-100: printOddNumbers1to100()
        //create method tospeal your name:
    }

    public static void countDownFrom20() {
        for (int i = 20; i > 0; i--) {
            System.out.println(i + " ");
    }
        System.out.println();}
  public static void  printOddNumbers1to100(){
      for (int i = 1; i >=100 ; i++) {
          if(i%2==1){
              System.out.println(i+" ");
  }
          System.out.println();}}
public static void spellingName() {
   String name="Ceylin";
    System.out.print(name+ "-->> ");
    for (int i = 0; i <name.length() ; i++) {
        if(i == name.length()-1){
            System.out.println(name.charAt(i));
        }else{
            System.out.print(name.charAt(i)+"-");}
    }}
      }
