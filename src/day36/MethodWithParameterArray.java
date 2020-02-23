package day36;

import java.util.Arrays;

public class MethodWithParameterArray {
    public static void main(String[] args) {
        int [] nums={1,5,3,4,7,2};
        System.out.println("before sort nums "+ Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("after sort nums "+ Arrays.toString(nums));
        changeArrayFirstItemTo100(nums);
        int [] a1={10,50,30,4,70,2};
        changeArrayFirstItemTo100(a1);
        Boolean b=true;
     Boolean result=   stringContainNumber("ytz13ck");
        System.out.println(result+" result");

    }public static void changeArrayFirstItemTo100(int[]numbers){
numbers [0]=100;
        System.out.println(Arrays.toString(numbers));
    }//write a static method to accept a String and return Boolean(Yes Uppercase) .
   // it should return true if the String contains at least one number.
public static Boolean stringContainNumber(String str) {
    for (int i = 0; i < str.length(); i++) {
        char eachChar = str.charAt(i);
        if (Character.isDigit(eachChar)) {
            return Boolean.valueOf(true);


        }
    }

    return Boolean.valueOf(false);


}

}

