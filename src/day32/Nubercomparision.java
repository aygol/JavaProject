package day32;

public class Nubercomparision {
    public static void main(String[] args) {
        /* numberComparision
         * this method has 2 parameters called num1 and num2
         * if num1 is more than num2 print num1 is more than num2
         * if num2 is more than num1 print num2 is more than num1
         * if num2 are equals num1 print they are equal
         *
         * String repeater
         * this method has 2 parameters
         *     String strToRepeat and int count
         *    repeat printing the string as many time as <count> number define
         *
         * skipCountBy3From0to50
         *
         * * create a method that has no parameter
         * and skip count by 3 from 0 to 50
         *
         * countDownByEvenNumberFrom50to0
         * * create a method that has no parameter
         * and count Down By Even Number From 50 to 0
         * for example 50 , 48 , 46 .....0
         *
         * print1toX
         * * create a method that has 1 int parameter called x
         * print from 1 to that number in one line
         * print an empty line after the print.
         *
         */
        numberComparision(8, 12);
        strToRepeat("Ayse", 4);
        skipCountBy3From0to50();
        countDownByEvenNumberFrom50to0();
        print1toX(5);
        print1toX(-10);
        countDownByEvenNumberFromXtoY(30,10);
    }

    public static void numberComparision(int num1, int num2) {

        if (num1 > num2) {
            System.out.println(num1 + " is more than " + num2);
        }
        if (num1 < num2) {
            System.out.println(num2 + " is more than " + num1);
        }
        if (num1 == num2) {
            System.out.println(num1 + " and " + num2 + " they are equal ");
        }
    }

    public static void strToRepeat(String str, int count) {
        for (int i = count; i >= 0; i--) {
            System.out.println(str);

        }
    }

    public static void skipCountBy3From0to50() {
        for (int num = 0; num <= 50; num += 3) {

            System.out.println(num);
        }
    }

    public static void countDownByEvenNumberFrom50to0() {
        for (int num = 50; num >= 0; num--) {
            if (num % 2 == 0) {
                System.out.println(num);
            }

        }
        System.out.println();
    }

    public static void print1toX(int x) {
        if (x > 0) {
            for (int i = 1; i <= x; i++) {
                System.out.println(i);
            }
        }
        if (x < 0) {
            for (int i = 1; i >= x; i--) {
                System.out.println(i);

            }
        }
    }

    public static void countDownByEvenNumberFromXtoY(int x,int y) {
        for (int i=x  ;i>= y ; i--) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
            }

    }
        System.out.println();
}}