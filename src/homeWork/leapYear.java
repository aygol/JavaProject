package homeWork;

public class leapYear {
    public static void main(String[] args) {
//In the Gregorian calendar three criteria must be taken into account to identify leap years:
//The year can be evenly divided by 4;
//If the year can be evenly divided by 100, it is NOT a leap year, unless;
//The year is also evenly divisible by 400.  Then it is a leap year.
//Write a method
//public static boolean isLeapYear(int year){
////TODO Your codes here
//        return false; //return correct result
        System.out.println(isLeapYear(1440));
        System.out.println(isLeapYear(1365));
        System.out.println(isLeapYear(1919));
        System.out.println(isLeapYear(2020)+" isLeapYear(2020)");
        System.out.println(isLeapYear(2019)+" isLeapYear(2019)");
        System.out.println(isLeapYear(2000)+" isLeapYear(2000)");
        System.out.println( isLeapYear(1000)+" isLeapYear(1000)");
     }  public static boolean isLeapYear(int year){
        boolean leapYear=false;
        if(year %4==0 ){
            leapYear=true;
            if(year % 400 ==0){
                leapYear=true;
            }
            else if(year %100==0){
                leapYear=false;
            } }
        return leapYear;
    }
}
