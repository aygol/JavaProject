package day14;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;

public class StringRewiew {
    public static void main(String[] args) {

     String str="I like Pumpkin";
        //System.out.println(str.equals("Pumpkin"));
        //contain:
       // it cheacks whether a string exists in another string
                System.out.println("Does it contains Pumpkin");
        System.out.println(str.contains("Pumpkin")  );
      boolean gotPumpkin=str.contains("Pumpkin");
        System.out.println("got pumpkin "+gotPumpkin);

      boolean startedWithI=str.startsWith("I") ;
        System.out.println("Started With I = "+startedWithI);

        boolean endWithPumpkin=str.endsWith("Pumpkin") ;
        System.out.println("End With Pumpkin = "+endWithPumpkin);
        //
      String password="wertyuisx";

        if(password.length()>=8&&password.length()<=16){


            boolean mustContains_or$=

                    password.contains("_")||password.contains("$");
            boolean mustNotContainsSpace=!password.contains(" ");


        }
            System.out.println("Valid Password");

            System.out.println("Invalid Password");



    }
}
