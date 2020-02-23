package day29;

import java.util.Arrays;

public class FillinUpStringAray {
    public static void main(String[] args) {
        //crete an array with size 300 and fill it up with I love Java
String[] strArr=new String[300];
strArr[0] ="I Love Java";
strArr[1] ="I Love Java";
strArr[2] ="I Love Java";
for(int i=0;i<strArr.length;i++) {
    strArr[i] = (i+1)+".I love Java";
}
        System.out.println("strArr= "+ Arrays.toString(strArr));
    }
}
