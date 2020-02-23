package ReplyIt;

import java.util.Arrays;

public class Task_Method {
    public static void main(String[] args) {
        System.out.println(convertKmToMiles(2));
        System.out.println(convertGallonToLiters(100));
        int[]array={2,8,5,4,7};
        arrayInDescendingOrder(array);
calculate(8,10,"*");
        calculate2(8,10,'*');
        calculate(8,10,"-");
        calculate2(8,10,'-');
        calculate(8,10,"@");
        calculate2(8,10,'#');




   ////1. write a method that can convert km to miles
        //        //	 				Hint: 1 km = 0.612 miles
       }public static double convertKmToMiles(double kM){
        double miles=kM*0.612;

        return miles;
    }//   //	 	2. write a method that can convert gallons to litters
    //	 			   Hint: 1 G = 3.75 L

    public static double convertGallonToLiters(double gallons){
        double litters=gallons*3.75;
   return litters;
    } //	 	3. write a method that can print out the array in Descending order
    public static void arrayInDescendingOrder(int[]array){
        Arrays.sort(array);
for(int i =array.length-1; i<=0;i--){
    System.out.println(array[i]+" ");
        }
    }//4. write a method that accepts 3 parameters: 2 numbers and one operator,
    //	 	and prints out the calculation
    //		if operator is not between [-, +, *, /, %] output should be Invalid Operator
    //			Ex: calculate(10, 2, "*") ==> 20;
    //				calculate(20, 2, "~") ==> invalid operator
public static void calculate (int a , int b,String operators){
       // boolean result=!operators.equals("-")||!operators.equals("+")||!operators.equals("*")||!operators.equals("/")||!operators.equals("%");
      //  if(result){
       //     System.out.println("invalid operator");
       //     return;
        if(operators.equals("-")){

    System.out.println(a-b);
}else if(operators.equals("+")) {

        System.out.println(a + b);

     }else if(operators.equals("*")){

        System.out.println(a*b);
}else if(operators.equals("/")){

        System.out.println(a/b);
    }else if(operators.equals("%")){

        System.out.println(a%b);
}else{
            System.out.println("Invalid Operations!!");



    }
       }public static void calculate2(int a,int b,char operator){
    switch(operator){
        case '-':
            System.out.println(a-b);
            break;
        case'+' :
            System.out.println(a+b);
            break;
        case '*':
            System.out.println(a*b);
            break;
        case'/' :
            System.out.println(a/b);
            break;
        case '%':
            System.out.println(a%b);
            break;
        default:
            System.out.println("invalid Operator!");
            break;

    }
}}


