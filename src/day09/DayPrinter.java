package day09;
import java.util.Scanner;
public class DayPrinter {
    public static void main(String[] args) {

      Scanner scan=new Scanner(System.in);
        int dayCode=scan.nextInt();
        if (dayCode==1){
            System.out.println("Day is Monday!");
        }
     else   if(dayCode==2) {
            System.out.println("Day is Tuesday!");
        }else if(dayCode==3){
            System.out.println("Day is Wednesday!");
     }
     else if(dayCode==4) {
            System.out.println("Day is Thurday!");
        }else if(dayCode==5) {
            System.out.println("Day is Friday!");
        }
        else if(dayCode==6) {
            System.out.println("Day is Saturday!");
        }else if(dayCode==7) {
            System.out.println("Day is Sunday!");
            }else{
            System.out.println("There are not a such a day!!!");

        }
        }


    }

