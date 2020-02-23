package day17;

public class CountingEvenNumber {
    public static void main(String[] args) {

        int num=100;
        //print only even numbers back from 100-0

        while(num>=0) {
            if(num%2==0){

                System.out.print(num+" ");

            }
            num-=1;

    }
}}
