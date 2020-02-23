package ReplyIt;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {

 //   Scanner scan = new Scanner(System.in);
    timeConversion( "07:05:45PM");
}
public static void timeConversion(String s) {
        /*
         * Write your code here.//12 am=00
         */
        int time1=0;
        String time="";
        if(s.contains("AM"))	{

            String [] arr=s.split(":");
            if(arr[0]=="12"){
                arr[0]="00";
            }time=arr[0]+":"+arr[1]+":"+arr[2].substring(0,2);
            System.out.println(time);
        } if(s.contains("PM")	){
            String [] arr=s.split(":");


        time=Integer.parseInt(arr[0])+(12)+":"+arr[1]+":"+arr[2].substring(0,2);
            System.out.println(time);
    }
}}

