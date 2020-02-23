package day57_Exceptions;

import org.w3c.dom.ls.LSOutput;

public class Try_Catch {

    public static void main(String[] args) {
        System.out.println("Before try catch:");//java.lang.ArithmeticException:
        try {
            int result = 10 / 0;

        } catch (ArithmeticException e) {
            System.out.println("Exception happened and was caught and handled");
            //if we write 0 exception printed and
        }
        System.out.println("After try catch");
  try{
      System.out.println("in second try block");
      String str="java is fun!";
      System.out.println(str.charAt(0));
      System.out.println(str.charAt(30));
      System.out.println(str.charAt(1));
  }catch(StringIndexOutOfBoundsException e){//exception e we can write it becaue it is prant class
      System.out.println("Exception happened and was caught and handled");
  }
            System.out.println("After second try catch");
        }
}