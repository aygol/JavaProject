package day26;

import java.util.Arrays;

public class ReverseAnarrayBySwappin {
    public static void main(String[] args) {
        int[] myNumbers = new int[7];
        myNumbers[0] = 5;
        myNumbers[1] = 3;
        myNumbers[2] = 21;
        myNumbers[3] = 2;
        myNumbers[4] = 1;
        myNumbers[5] = 13;
        myNumbers[6] = 8;
        System.out.println(Arrays.toString(myNumbers));
        System.out.println();
        System.out.println(myNumbers[0]+"*****"+myNumbers[(myNumbers.length-1)-0]);
        System.out.println(myNumbers[1]+"*****"+myNumbers[(myNumbers.length-1)-1]);
        System.out.println(myNumbers[2]+"*****"+myNumbers[(myNumbers.length-1)-2]);
        System.out.println(myNumbers[3]+"*****"+myNumbers[(myNumbers.length-1)-3]);
        System.out.println("******");
        for (int x = 0; x <= myNumbers.length / 2; x++) {
            System.out.println(myNumbers[x]+"*****"+myNumbers[(myNumbers.length-1)-x]);
int temp=myNumbers[x];
myNumbers[x]  =      myNumbers[(myNumbers.length-1)-x];
            myNumbers[(myNumbers.length-1)-x]=temp;



        }
        System.out.println("After we swap the array "+Arrays.toString(myNumbers));
    }
}