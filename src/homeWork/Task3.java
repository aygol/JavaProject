package homeWork;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

       // Ask user to enter full name
       // assuming full name is 2 word
       // Write a program to print users initials
      //  for example :
      //  Jon Snow -->> Initial is JS
        Scanner scan=new Scanner(System.in);
        System.out.println("enter full name");
        String fullName=scan.nextLine();
        System.out.println(fullName.charAt(0)+""+fullName.charAt(fullName.indexOf(" ")+1));






    }

}
