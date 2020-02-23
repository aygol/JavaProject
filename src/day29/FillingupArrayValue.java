package day29;

import java.util.Arrays;

public class FillingupArrayValue {
    public static void main(String[] args) {
        int[]numbers=new int[100];
        System.out.println(Arrays.toString(numbers));//it gives fault value
    numbers[0]=1;//loop is calling and we can write x and x+1
    numbers[1]=2;
    numbers[2]=3;
  for(int x=0;x<numbers.length;x++)  {
      numbers[x]=x+1;
  }


    System.out.println(Arrays.toString(numbers));
    }
}
