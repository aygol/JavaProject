package day05;

public class VariablePractice {
    public static void main(String[] args) {
        /* 8 primitive data type
        please calculate age task 1: age calculater given birth date
         */
        int birthYear= 1975;
        int currentYear= 2019;
        int age = currentYear - birthYear;
       // System.out.println("I was born in year "+2001 + ",and I am "+(2019-2001)+"years old");
        System.out.println("I was born year "+ birthYear +" , and I am "+ age+"years old");
        // task 2: you are speeding today speed limit is some number and your current speed is this
        //generate this output of= you are driving 10mph more than speed limit speedlimit as int current speed as int over the limit as int
        int currentSpeed=50;
        int speedLimit =55;

        int overTheLimit = speedLimit-currentSpeed;
        System.out.println("My current speed limit "+ " "+overTheLimit+" mph/h "+" "+"more than "+ "speed limit");
    }
}
