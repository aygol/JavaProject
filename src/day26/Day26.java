package day26;

import java.util.Arrays;

public class Day26 {
    public static void main(String[] args) {
 //   Default value for array item if it is empty
 //byte short int long  you can get 0
 //float double you get 0.0   char we get '' empty space
int[] myNumbers=new int[4];
myNumbers[0]=10;
myNumbers[1]=40;
myNumbers[2]=30;
myNumbers[3]=7;
int lastItemValue= myNumbers[3];
lastItemValue= myNumbers[myNumbers.length-1];
//i want to double second item value
     myNumbers[1]= myNumbers[1]+1;
myNumbers[1]=myNumbers[1]*2;
   // i want to assign to 3 item valur to sum of fordt anf seconf item

   myNumbers[2]=myNumbers[0]+myNumbers[1];
    //swap first item with last item
        System.out.println(myNumbers[2]);
       int temp=myNumbers[0];
       myNumbers[0]=myNumbers[myNumbers.length-1];
 myNumbers[myNumbers.length-1]=temp;

System.out.println("after swap last item with first item "+myNumbers[myNumbers.length-1]);
     String name1="Abdurrahman" ;
     String name2="Ayse";
String temp1=name1;
name1=name2;
name2=temp1;

        System.out.println("name1= "+ name1);
        System.out.println("name2= "+ name2);
        System.out.println("my numbers "+ Arrays.toString(myNumbers));
//how can I swqp 30 40
int temp2=myNumbers[1];
myNumbers[1]=myNumbers[2];
myNumbers[2]=temp2;
        System.out.println("my numbers "+ Arrays.toString(myNumbers));
//how did I come up with 0   and 3
  //      how did I come up with 0+1   and 3-1=2

    }
}
