package day12;

public class WarmUp_sezon {
    public static void main(String[] args) {
     int month=7;

        int january=1;
        int february=2;
        int march=3;
        int april=4;
        int may=5;
        int june=6;
        int july=7;
        int agust=8;
        int september=9;
        int octaber=10;
        int november=11;
        int december=12;
             if (month >12||month<1) {
                 System.out.println("INVALID MONTH");

             }   else if (month >=3 && month<=5){
                     System.out.println("It is Spring");

             }   else if (month >=6 && month<=8) {
                 System.out.println("It is summer");
             } else if (month >=9 && month<=11) {
                 System.out.println("It is summer");
             }  else if (month ==1 || month==2|| month==12){
                         System.out.println("It is winter");

                     }
}}
