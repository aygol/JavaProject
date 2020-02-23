package day01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Taskfactor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


  int num=sc.nextInt();
  int divider=2;
  while(num>1){
    if(num%divider==0) {
      System.out.println(divider);
      num=num/divider;

      while (num%divider==0) {
          System.out.println(divider);
          num = num / divider;

      }}
      divider++;
  }

    }
}
