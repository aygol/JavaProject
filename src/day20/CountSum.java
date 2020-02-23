package day20;

import java.sql.SQLOutput;

public class CountSum {
    public static void main(String[] args) {
     int sumOdd=0;
        for (int i = 10; i <100 ; i++) {
            if(i %2!=0){
           sumOdd=sumOdd+i;
                System.out.print("Odd number"+sumOdd);
            }else{
                System.out.print("");
            }

        }








    }
}
