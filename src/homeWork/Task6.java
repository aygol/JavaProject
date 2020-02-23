package homeWork;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        //    Ask user to enter full name
        //        assuming full name is 2 word
        //        Write a program generate email account as below:
        //        it starts with first character of first name
        //        and whole last name then @NightWatch.com
        //        for example :
        //        Jon Snow -->> JSnow@NightWatch.com

        Scanner scan=new Scanner(System.in);
        System.out.println("enter full name");
        String fullName=scan.nextLine();
        int lastNameStarts=fullName.indexOf(" ")+1;
        String email= fullName.charAt(0)+""+ fullName.substring(lastNameStarts)+""+"@NightWatch.com";
        System.out.println("your suggested email: "+email);







    }
}
