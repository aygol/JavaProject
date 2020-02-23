package day34;

public class CreateOverloadingPractice {
    public static void main(String[] args) {
add(6);
add(4,6);
add(3,5,100);
add(123459L,87643L);
    }public static void add(int num){
int     sum =num+100;
        System.out.println("num+100 = "+sum);

    }public static void add(int num1,int num2){
 int sum=num1+num2;
        System.out.println("add(int num1,int num2) = "+sum);

    }public static void add(int num1,int num2,int num3){
        int sum=num1+num2+num3;
        System.out.println("(int num1,int num2,int num3) = "+sum);

    }public static void add(long num1, long num2){

long sum=num1+num2;
        System.out.println("long num1, long num2 = "+sum);
}}