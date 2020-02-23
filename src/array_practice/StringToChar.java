package array_practice;

import java.util.Arrays;

public class StringToChar {
    public static void main(String[] args) {

String name="Anastasia";

char[] charName= name.toCharArray();


  for (char eachChar:charName){

      System.out.println(eachChar);
  }
        System.out.println("***");
    int count=0;
    for(char each:charName){
        if(each=='a'){
            count++;
        }
    }
        System.out.println("count of a = "+count);
    Arrays.toString(charName);
        System.out.println("not sorted "+Arrays.toString(charName));
Arrays.sort(charName);
        System.out.println("char name after sorted "+Arrays.toString(charName));






    }}
