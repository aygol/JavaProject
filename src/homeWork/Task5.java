package homeWork;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

 //    given a name with prefix, stored in a String variable called name
        //        for example
        //        Dr. Dru , Mr. Robot , Ms. Lois , Mrs. Brown
        //                -- in case insensitive condition ----
        //        print as below
        //        if the name Started with (Dr )-->> Doctor
        //        if the name Started with (Mr )-->> Male
        //        if the name Started with (Miss )-->> Single female
        //        if the name Started with (Mrs )-->> Married female





Scanner scan=new Scanner(System.in);
        System.out.println("Please enter prefix and name:");
        String name = scan.nextLine();


        if (name.substring(0,3).equalsIgnoreCase("Dr.")){
            System.out.println("Doctor");
        }else  if (name.substring(0,3).equalsIgnoreCase("Mr.")){
            System.out.println("Male");
        } else  if (name.substring(0,4).equalsIgnoreCase("Miss")){
            System.out.println("Single Female");
        }else  if (name.substring(0,4).equalsIgnoreCase("Mrs.")) {
            System.out.println("Married Female");
        } else System.out.println("No prefix");{


    }
    }
}