package homeWork;

import java.util.Scanner;

public class Reply157 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        /*
         * Write your code here.
         */
        String s1="";
        if(s.contains("PM")){
            s1+=(12+s.substring(0,2))+s.substring(2,s.length()-2 );
            System.out.println(s1);
        }else{s1+=s.substring(0,s.length()-2  );
            System.out.println(s1);
        }


    }
}

