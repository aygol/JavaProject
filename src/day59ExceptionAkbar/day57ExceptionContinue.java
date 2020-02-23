package day59ExceptionAkbar;

import java.util.Scanner;

public class day57ExceptionContinue {
    public static void main(String[] args) {

      //  try {
          //  int i = "SAfiye"; it is type error and try catch not solve the problem
      //  } catch (Exception e) {
      //      System.out.println("Exception catch");
       // }
    String name="Furkan";//StringIndexOutOfBoundsException:
  //  name.charAt(100);
  //exception is a class we can create object ourselves just like we did from any other classes   }

        Scanner scan=new Scanner(System.in);
        System.out.println("Which index you want to get from Furkan's Name?" );
   try {
       int targetIndex = scan.nextInt();
       System.out.println(targetIndex + " indexs of the alphabe is " + name.charAt(targetIndex));
   }catch(Exception e){
       System.out.println("can you give me number that exceptable index for string");
   }
}}