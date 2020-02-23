package day34;

import ReplyIt.Method_Task_tekrar;
import day31.Calculator_V2;
import day31.Greeting;

import java.util.Arrays;

public class MathAction {
    public static void main(String[] args) {
        // call yourBuild3DigitsNumbers method here
        int result1= Method_Task_tekrar.build3DigitNumber(6,4,3);
        System.out.println("result = "+result1);
       int []nums={2,5,87};
        System.out.println("Arrays.toString(nums) = "+ Arrays.toString(nums));
    Calculator_V2.calculate('*',6,8);
    Calculator_V2.calculate('-',6,8);
    Greeting.sayHelloTo(("Ayse"));
    }


    }

