package ReplyIt;

import java.util.Scanner;

public class Reply155 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();
        next3(num) ;

    }public static void next3(int num){

        int next1=num+1;
        int next2=num+2;
        int next3=num+3;
        System.out.println("next 3 are:"+"\n"+next1+" "+next2+" "+next3);


    }
}
