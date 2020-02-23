package day07;

public class Casting {
    public static void main(String[] args) {
       // int num=10;
                //double bigNum=10;
               // System.out.println(bigNum);//implicitly(automatically) converted to double 10.0 and stored inside bigNum behind scene
 /*12.99 is double , double has much bigger range than int so it does not fit
 int num=12.99; compeler error!!!*/
 //int num=(int) 12.99;
//System.out.println(num);
long num1=456789678678L;
int num2=(int) num1;
        System.out.println(num2);


    }
}
