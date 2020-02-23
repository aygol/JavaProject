package homeWork;

import java.util.Scanner;

public class TaskASCII {
    public static void main(String[] args) {
        //  HOMEWORK
        // CREATE AN INTERACTIVE PROGRAM TO ASK USER
        // STARTING CHARACTER AND ENDING CHARACTER
        // THEN PRINT EVERYTHING IN BETWEEN
        // IT COULD BE STARTING CHARACTER IS AFTER ENDING CHARACTER
        // FOR EXAMPLE USER CAN ENTER  Z A  , or A K
        // Can we ask user character ? NO!!!!
        // Ask user for String and pick first character by charAt(0)
    Scanner scan= new Scanner(System.in);

        char start = scan. next(). charAt(0);

//  String line="";
//        for(char ichar='A';ichar<='Z';ichar++){
//            line=line+ichar;
//            System.out.println(line);
        char end = scan. next(). charAt(0);
    String    line="";
      if(start<end) {

          for (char i = start; i <= end; i++) {
              line = line + i;
              System.out.println(line);
          }
      }else
               for(char i=start;  i>=end; i--) {
                   line=line+i;
                   System.out.println(line);
    }
}}
